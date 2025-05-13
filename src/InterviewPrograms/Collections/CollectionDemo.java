package InterviewPrograms.Collections;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Integer> c=new ArrayList();
        c.add(100);
        c.add(100); c.add(100); c.add(200);
        System.out.println(c);
        Object[] a1 = c.toArray();
        System.out.println(Arrays.toString(a1));

        //List-Interface, index-based, insertion order maintained, duplicates allowed, nulls also possible
        //Set - Interface,no index-based, no insertion order maintained, no duplicates allowed, only one null is possible

        List l1=new LinkedList<>();
        l1.addAll(c);
        System.out.println("List:"+l1);
        l1.add(null);
        l1.set(1, 500);
        System.out.println("List1:"+l1);
        List l2=new ArrayList();
        l2.add(100);l2.add(500);l2.add(100);l2.add(200);l2.add(null);
        System.out.println("List2:"+l2);
        System.out.println(l1.equals(l2));

        Set s1=new HashSet();
        s1.add(100);
        s1.add(200);
        s1.add(200);
        s1.add(null);
        s1.add(null);
        System.out.println("Set1:"+s1);
        System.out.println(s1.contains(20));
        System.out.println("Set1:"+s1);

        System.out.println(s1.size());


    }
}
