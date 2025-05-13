package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class CollectionDemo1 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(20);
        a1.add("Appu");
        a1.add('P');
        a1.add("Shiva");
        System.out.println(a1);
        System.out.println(a1.contains('w'));//false


        LinkedList l1=new LinkedList();
        l1.add("Poo");
        l1.add('q');
        l1.add(90);
        System.out.println(l1);

        HashSet hs=new HashSet();
        hs.add("Shiva");
        hs.add(45);
        System.out.println(hs);

        System.out.println(hs.contains("Poo")); //false

    }
}
