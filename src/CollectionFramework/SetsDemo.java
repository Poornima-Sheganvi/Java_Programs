package CollectionFramework;

import java.util.*;

public class SetsDemo {
    public static void main(String[] args) {

        //hashset
        Set<String> sets=new HashSet<>();
        sets.add("Appu");
        sets.add("Rani");
        sets.add("John");
        sets.add("Shiva");
        sets.add("Poo");
        //duplicates
        sets.add("Appu");
        sets.add("Rani");
        sets.add("John");
        sets.add(null);

        System.out.println("HashSet elements are::" + sets);
        sets.remove(null);
        sets.remove("Rani");
        sets.remove("John");
        System.out.println("HashSet elements are::" + sets);

        if(sets.contains("Appu")){
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }

        //linkedhashset
        Set<String> set1=new LinkedHashSet<>();
        set1.add("Appu");
        set1.add("Rani");
        set1.add("John");
        set1.add("Shiva");
        set1.add("Poo");
        //duplicates
        set1.add("Appu");
        set1.add("Rani");
        set1.add("John");
        set1.add(null);

        System.out.println("Linked Hashset elements are::" + set1);

        //set methods
        //add -> add the element
        //remove -> remove the element
        //contains -> search for the element in the sets

        //treeset
        Set<String> set2=new TreeSet<>();
        set2.add("Appu");
        set2.add("Rani");
        set2.add("John");
        set2.add("Shiva");
        set2.add("Poo");
        //duplicates
        set2.add("Appu");
        set2.add("Rani");
        set2.add("John");
       // set2.add(null);  //in tree null cant be inserted, we get error as NullPointerException
        set2.add("Linux");

        set2.remove("John");

        System.out.println("Tree Hashset elements are::" + set2);

        Set<Integer> setI=new TreeSet<>();
        setI.add(6690);
        setI.add(5612);
        setI.add(8990);
        setI.add(9540);
        setI.add(4390);
        setI.add(98);
        System.out.println("Tree HashSet Integer elements are:::" + setI);

    }
}
