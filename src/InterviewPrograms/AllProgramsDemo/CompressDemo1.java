package InterviewPrograms.AllProgramsDemo;

import java.util.HashMap;
import java.util.Map;

public class CompressDemo1 {
    public static void main(String[] args) {
        String s1 = "aabbddww";

        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> enter : map1.entrySet()) {
            System.out.print(enter.getKey());

        }
    }
}













        /*String s="agffwewdrtd";
        HashMap<Character,Integer> map=new HashMap<>();
        for (char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        for (Map.Entry<Character,Integer> enter: map.entrySet()){
            System.out.print(enter.getKey());
        }


    }*/

