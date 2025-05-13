package InterviewPrograms.Collections;

import java.util.*;

public class MapsDemo1 {
    public static void main(String[] args) {

        List<Integer> l = new LinkedList();
        l.add(100);
        l.add(1);
        l.add(10);
        l.add(3);
        l.add(8);
        System.out.println(l);
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) % 2 == 0)
                System.out.println("Even: " + l.get(i));
        }

        for (int data : l) {
            if (data % 2 == 0)
                System.out.println("Even: " + data);
        }
        Iterator<Integer> itr = l.iterator();
        while (itr.hasNext()) {
            int data = itr.next();
            if (data % 2 == 0)
                System.out.println("Even: " + data);
        }
        List l2 = l.stream().filter(d -> d % 2 != 0).toList();
        System.out.println(l2);

        Map<Integer, String> m = new HashMap<>();//Group of Key and value pairs, each K-V pair is an Entry, group of entries Map,
        //// Keys are unique(KeySet), values van be duplicated(collection)
        m.put(3, "Arjun");
        m.put(4, "Ram");
        m.put(1, "Shiva");
        m.put(2, "Poo");

        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.values());
        for (Map.Entry<Integer, String> e : m.entrySet()) {
            if (e.getKey() % 2 == 0)
                System.out.println(e.getValue());
        }

        Set<Integer> s=new HashSet();
        s.add(10);s.add(3);s.add(1);s.add(5);
        System.out.println(s);
        TreeSet ts=new TreeSet<>(s);
        System.out.println(ts);
    }
}
