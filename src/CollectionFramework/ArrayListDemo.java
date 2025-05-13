package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        //new array list created
        List<Integer> test = new ArrayList<>();

        //insert an element to array list
        test.add(30);
        test.add(67);
        test.add(90);
        test.add(34);
        test.add(55);

        //iterate array list
        for (Integer number : test){
            System.out.println("Numbers are:" +number);
        }

        //find by index
        for(int i=0; i<test.size(); i++){
            System.out.println("Number accessed by using the index::" + test.get(i));
        }

        List<String> li=new ArrayList<>();
        li.add("Java");
        li.add(null);
        li.add("Linux");
        li.add("Git");
        li.add(null);
        li.add("Selenium");
        li.add("Framework");
        li.add("SQL");
        li.add(null);
        System.out.println("Elements are: " + li);


    }
}
