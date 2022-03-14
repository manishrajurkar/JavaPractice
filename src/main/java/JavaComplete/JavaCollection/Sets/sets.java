package JavaComplete.JavaLoops.JavaCollection.Sets;

import java.util.HashSet;
import java.util.Set;

public class sets {

    public static void main(String[] args) {
        Set<Integer>  set1 = new HashSet<Integer>() ;
        set1.add(1);
        set1.add(2);
        System.out.println("Set1:" +set1);
        System.out.println("Set1 Size:" +set1.size());
        System.out.println(set1.isEmpty());

        Set<Integer> set2 = new HashSet<>() ;
        set2.add(3);
        set2.add(4);

        //Union of Sets
        set1.addAll(set2);
        System.out.println("Union is :" + set1);



    }
}
