package InterviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateSet {
    public static void main(String[] args) {
        String arr[]={"Apple", "Banana","Apple","Orange"};
        Set<String> fruits=new HashSet<>();
        for (String str:arr){
            fruits.add(str);
        }
        System.out.println("fruits:" +fruits);
    }
}
