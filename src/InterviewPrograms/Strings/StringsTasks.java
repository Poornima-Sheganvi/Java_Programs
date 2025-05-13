package InterviewPrograms.Strings;

import java.util.Arrays;

public class StringsTasks {
    public static void main(String[] args) {

       /* String s1= "Hello";
        String s2=new String("Hello");

        System.out.println(s1.equals(s2));//true
        System.out.println(s1==s2); //false == checks reference are pointed same object

        String s3="Hello";
        System.out.println(s1==s3); //true

        String s4=new String("Hello");
        System.out.println(s2.equals(s4)); //true
        System.out.println(s2==s4);//false
        */
/*
        String s1 = "Java";
        String s2 = "Java";
        s1 = s1 + " is a ";
        System.out.println(s1);
        s1 = s1 + " Programming ";
        System.out.println(s1);
        s1 = s1 + " Language ";
        System.out.println(s1);
        String s3 = s1.concat("hello");
        System.out.println(s3);
        s3 = s3 + " world ";
        System.out.println(s3);*

        System.out.println(s3.length());
        char[] chars1=s3.toCharArray();
        System.out.println( Arrays.toString(chars1));*/


       /* StringBuffer sb = new StringBuffer("Hi");
        System.out.println(sb);
        sb.append(" hi");
        System.out.println(sb);
        sb.append( 10190.23435);
        System.out.println(sb);
        sb.insert(1, "JAVA");
        System.out.println(sb);
        sb.insert(4,"Linux");
        System.out.println(sb);

        sb.replace(1,4,"Java");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(1,5);
        System.out.println(sb);*/


        StringBuilder sb1=new StringBuilder("Java");
        System.out.println(sb1);
        sb1.append(" Oops");
        System.out.println(sb1);
        System.out.println(  sb1.length());
        String  st1=sb1.toString();
        System.out.println(sb1.capacity());
        sb1.append("Collection framework");
        System.out.println(sb1.capacity());
        sb1.append("Exception Handling");
        System.out.println(sb1.capacity());
        sb1.ensureCapacity(90);


    }
}
