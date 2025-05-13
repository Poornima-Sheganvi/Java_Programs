package InterviewPrograms;

import java.util.ArrayList;
//Interview Program
public class RemoveEleArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arr1=new ArrayList<>();
        arr1.add("A");
        arr1.add("B");
        arr1.add("C");
        arr1.add("D");
        arr1.add("F");
        arr1.add("H");
        arr1.add("K");
        arr1.add("L");
        arr1.add("M");
        arr1.add("P");

        if (arr1.size()>3){
            arr1.remove(3);
        }
        if (arr1.size()>6){
            arr1.remove(6);
        }
        System.out.println(arr1);
    }
}
