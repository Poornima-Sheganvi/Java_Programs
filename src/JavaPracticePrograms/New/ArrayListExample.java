package JavaPracticePrograms.New;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        //print all elements
        for (String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
