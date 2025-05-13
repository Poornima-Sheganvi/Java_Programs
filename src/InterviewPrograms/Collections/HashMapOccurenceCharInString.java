package InterviewPrograms.Collections;

import java.util.HashMap;

public class HashMapOccurenceCharInString {
    public static void main(String[] args) {
        String s1="PoornimaShiva";
        HashMap<Character,Integer>charCount=new HashMap<>();
        for (char c:s1.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c,0)+1);

        }
        for (char c: charCount.keySet()){
            System.out.println("Character: " + c +", Count: " + charCount.get(c));
        }

    }
}
