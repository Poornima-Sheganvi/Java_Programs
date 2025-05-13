package InterviewPrograms.Strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateStringDemo {
    public static void main(String[] args) {
        String arr[]={"Apple", "Banana","Apple"};
        HashMap<String,Integer> map=new HashMap<>();
        for(String str : arr){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        System.out.println(map);
        for(Map.Entry<String,Integer> m1: map.entrySet()){
            if(m1.getValue()>1){
                System.out.println("This element is duplicate:" +m1.getKey());
            }
        }
    }
}
