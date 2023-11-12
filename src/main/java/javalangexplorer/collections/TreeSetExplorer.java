package javalangexplorer.collections;

import java.util.Collections;
import java.util.Objects;
import java.util.TreeSet;

/*
       Treeset features
        -> duplicates will be ignored
        -> insertion order not maintained
        -> sort order allowed
        -> only one null is allowed (but with a twist)
     */
public class TreeSetExplorer {

    public static void main(String[] args) {
        System.out.println("Tree set Explorer");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("king");
        treeSet.add("queen");
        treeSet.add("minister");
        treeSet.add("soldier");
        System.out.println("Tree Set: "+treeSet);





    }
}
