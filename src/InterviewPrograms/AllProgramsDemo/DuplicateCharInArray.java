package InterviewPrograms.AllProgramsDemo;

import java.util.HashMap;
import java.util.Map;

//Write a java program to find duplicate character in an array
public class DuplicateCharInArray {
    public static void main(String[] args) {

        char[] c = {'a', 'b', 'd', 'a', 'b', 'i', 'd', 'd', 'e', 'a'}; //group of data can be list,set,map,array
        Map<Character, Integer> map = new HashMap();
        for (char c2 : c) {   //c is group of data, c2 is a single data from c on every iterator one by one
            map.put(c2, map.getOrDefault(c2, 0) + 1);
        }
        System.out.println(map);
    }
}


