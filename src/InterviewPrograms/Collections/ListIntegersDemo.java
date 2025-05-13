package InterviewPrograms.Collections;

import java.util.ArrayList;
import java.util.List;


//global or instance variable: created within class area and outside of anyblock like constructor/methods.these r instance level/ called in any other blocks by creating objects
//local: variable created inside block.
//static: same as global with statuc keyword and we can access anywhere without object creation. these r class level
public class ListIntegersDemo {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(5);
        li.add(1);
        li.add(8);
        li.add(15);
        li.add(5);
        System.out.println(li);

        System.out.println( li.size());




        /*Collections.sort(li);
        System.out.println(li);*/
    /*int n=li.get(3);
        System.out.println(n);
        System.out.println(li.get(4));

        li.add(0,12);
        System.out.println(li);

        li.addFirst(45);
        li.addLast(33);
        System.out.println(li);

        System.out.println( li.isEmpty());

       int s1= li.size();
        System.out.println(s1);

        System.out.println(li);
        System.out.println( li.remove(3));
        System.out.println(li);

       *//* li.clear();
        System.out.println(li);*//*

        System.out.println(li.contains(435));

        *//*Collections.sort(li, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(li);*//*
*/

    }
}




















       /* for(int i=0; i<li.size()-1;i++){
        for(int j=0; j<li.size()-i-1;j++){
        if (li.get(j) > li.get(j+1)){
        int  temp=li.get(j);
                   li.set(j, li.get(j+1));
        li.set(j+1,temp);
                }
                        }
                        System.out.println(li);
        }*/