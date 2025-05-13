package InterviewPrograms.Collections;

import java.util.HashMap;
import java.util.Map;

public class DummyDataArray {
    public static void main(String[] args) {

        char[] c = {'a', ' ', 'd', 'a', '*', 'i', ' ', 'd', 'e', 'a' }; //group of data can be list,set,map,array
        Map<Character, Integer> map = new HashMap();
        for (char c2 : c) {   //c is group of data, c2 is a single data from c on every iterator one by one
            map.put(c2, map.getOrDefault(c2, 0) + 1);
        }
        System.out.println(map);

//        for (int i = 0; i < c.length; i++) {
//            int count = 1;
//            char c1 = c[i];
//            if (c1 == ' ')
//                continue;
//            for (int j = i + 1; j < c.length; j++) {
//                char c2 = c[j];
//                if (c1 == c2) {
//                    count++;
//                    c[j] = ' ';
//                }
//            }
//            if (count > 1)
//                System.out.println("Duplicate character " + c1 + "-->" + count);
//
//        }
        String s1 = "Poornima"; //aminrooP
        String rev = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            char ch1 = s1.charAt(i);
            rev = rev + ch1;
        }


    }
}




























/* int num[]={1,2,3,6,2,3,7,8,4,4,2,4};
        System.out.println("Duplicate elements in given array:");

        for(int i=0; i< num.length;i++){
            for (int j=i+1; j< num.length;j++){
                if(num[i]==num[j])
                    System.out.println(num[j]);
            }
        }*/
/*
String s="Java Programming Language";
int totalcount= s.length(); //find total length
int countremoved= s.replace("m", "").length();  //total length after removing a
int count=totalcount-countremoved;  //
        System.out.println("Number os occurance of a is:" +count);
*/
