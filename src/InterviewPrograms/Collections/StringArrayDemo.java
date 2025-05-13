package InterviewPrograms.Collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StringArrayDemo {
    public static void main(String[] args) {
        String[] arr1 = {"Shiva", "Acchu", "Poo"};

        List<String> l1 = new LinkedList();
//      //inbuilt methods used
//        l1.addAll(List.of(arr1));
//        System.out.println(l1);
//        l1.add("fhgf");
//        System.out.println(l1);

       /* List l2=Arrays.asList(arr1);
        System.out.println(l2);*/
//for loop
        for (int i = 0; i < arr1.length; i++) {
            l1.add(arr1[i]);
        }
        System.out.println(l1);
        l1.add("e7q6eytgdd");
        System.out.println(l1);


//for each loop used
        for (String n1 : arr1) {
            l1.add(n1);

        }
        System.out.println(l1);
        l1.add("wprkjsf");
        System.out.println(l1);


        //add ele from list to array
        Object o1=l1.toArray();



      /* //Object[] s1= l1.toArray();
        Object[] s1=new Object[l1.size()];
        System.out.println(s1.length);
        //System.out.println(s1[1]);
        System.out.println(Arrays.toString(s1));
        for(int i=0;i<s1.length;i++){
            s1[i] =l1.get(i);
        }
        System.out.println(Arrays.toString(s1));
*/
    }


}
