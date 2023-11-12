package javalangexplorer.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
  Set features
   -> duplicates will be ignored
   -> insertion order not maintained
   -> sort order allowed
   -> hetrogenous elements allowed
   -> only one null is allowed
*/


/*
  Set operations
  Union - addAll()
  Intersect - retainAll()
  Difference - removeAll()
  Subset - containsAll()

*/

public class SetExplorer {
    public static void main(String[] args) {
        System.out.println("Set Explorer");
        Set<String> hashSetOne = new HashSet<>();
        hashSetOne.add("king");
        hashSetOne.add("queen");
        hashSetOne.add("minister");

        Set<String> hashSetTwo = new HashSet<>();
        hashSetTwo.add("king");
        hashSetTwo.add("queen");
        hashSetTwo.add("minister");
        hashSetTwo.add("Hero");

        //addAll() for UNION
        //hashSetOne.addAll(hashSetTwo);
        //System.out.println("Union Result " + hashSetOne);

        //retainAll() for INTERSECTION
        //hashSetOne.retainAll(hashSetTwo);
        //System.out.println("Intersection Result " + hashSetOne);

        //removeAll() for difference
        //hashSetOne.removeAll(hashSetTwo);
        //System.out.println("Difference Result " + hashSetOne);

        //containsAll() for checking subset
        //System.out.println("subset checking 1 : "+ hashSetOne.containsAll(hashSetTwo));
        //System.out.println("subset checking 2: "+ hashSetTwo.containsAll(hashSetOne));



    }
}





