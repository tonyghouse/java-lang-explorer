package javalangexplorer.multithreading;

import java.util.concurrent.*;

public class ThreadsExplorer<U> {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Treading Explorer");

        //Two ways to use thread in java
        // 1. by extending Thread class
        CountTask countTask = new CountTask();
        countTask.start();

        //2. by implementing Runnable interface
        DisplayTask displayTask = new DisplayTask();
        Thread displayTaskThread = new Thread(displayTask);
        displayTaskThread.start();

        //3. callable interface
        ExecutorService  executorService = Executors.newFixedThreadPool(4);
        MultipleTask<Integer> multipleTask = new MultipleTask<>();
        Future<Integer> result = executorService.submit(multipleTask);
        System.out.println("checking result: "+result.get());
        executorService.shutdown();


    }
}

class CountTask extends Thread {

    @Override
    public void run(){
        System.out.println("counting....");
    }


}

class DisplayTask implements Runnable {

    @Override
    public void run(){
        System.out.println("displaying....");
    }


}

class MultipleTask<V> implements Callable<V>{

    @Override
    public V call() throws Exception {
        return (V) Integer.valueOf(1*2*3*4*5);
    }
}

