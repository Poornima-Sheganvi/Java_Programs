package InterviewPrograms.Strings;

import java.util.Arrays;

public class StringsDemo {

    public static void main(String[] args) {
      /*  String s1 = "Shiva";//String literal
        String s2 = new String("Shiva");//new keyword
        //  String s3=new String("Poornima");//new keyword

        System.out.println(s1.equals(s2));//equals method checks value of string are equal or not
        System.out.println(s1==s2);//== checks reference are pointed same object
        String s3="Shiva";
        System.out.println(s1.equals(s3));//true
        System.out.println(s1==s3);//true

        String s4=new String("Shiva");
        System.out.println(s2.equals(s4));//true
        System.out.println(s2==s4);//false

       */
        String s1="Shiva";
        String s2="Shiva";
        s1=s1+"Software";//Shiva+Software=ShivaSoftware
        System.out.println(s1);
        System.out.println(s2);
        s1=s1+"Centre";
        System.out.println(s1);//ShivaSoftwareCentre
       String s3= s1.concat("Ltd");//ShivaSoftwareCentreLtd
        System.out.println(s1);
        System.out.println(s3);
        s3= s3+" ";

        StringBuffer sb=new StringBuffer("Hi");
        System.out.println(sb);
        sb.append("Hello");
        System.out.println(sb);
        sb.append(10.1023);
        System.out.println(sb);

        StringBuilder sb1=new StringBuilder("Java");
        System.out.println(sb1);
        sb1.append(false);
        System.out.println(sb1);

        System.out.println(s3.length());
        char[] charsc1= s3.toCharArray();
        System.out.println(Arrays.toString(charsc1));
        String s4=new String(charsc1);
        System.out.println(s4);









    }
}
