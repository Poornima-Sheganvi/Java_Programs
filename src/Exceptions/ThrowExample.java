package Exceptions;

import java.util.Arrays;

public class ThrowExample {

    public static void main(String[] args) {

        String browser="Sky";
        if (browser.equals("chrome")){
            System.out.println("chrome launched");

        }
        else if (browser.equals("Mozilla")) {
            System.out.println("Mozilla launched");

        }
        else if (browser.equals("Edge")) {
            System.out.println("Edge launched");

        }
        else{
            throw new IllegalArgumentException("invalid browser:"+browser);
        }













        /*String s="Poornima";
        System.out.println(s.charAt(10));*/

        /*String [] n={"Poo","Shiva","Appu"};
        for(int a=0;a< n.length;a++){
            System.out.println(n[a]);
        }*/

        /*int [] i={1,5,3,99,6};
        for(int a=0;a< i.length;a++){
            System.out.println(i[a]);
        }
        double [] d= {1.6,3.4,5.6,7.8,9.7,3,7,8,4,3,15,67,89,43,32,55,78,778,456,33};
        for(int a=0;a< d.length;a++){
            System.out.println(d[a]);

        System.out.println(Arrays.toString(i));*/


    }
}
