package JavaPracticePrograms.New;

//Strings practice
public class StringsDemo {
    public static void main(String[] args) {
        String s1=" Hello";
        String s2=" Java is programming language";

        System.out.println("String s1:" +s1);
        System.out.println("String s2: " +s2);

        System.out.println( s1.length());
        System.out.println(s1.charAt(3));
        System.out.println(s1.equals("Hello"));//true
        System.out.println(s1.toLowerCase());//hello

        String s3="  Strings are immutable";
        System.out.println( s1.concat  (s3));
        System.out.println(s2.concat(s1));
        System.out.println( s3.indexOf("Welcome"));

        System.out.println("---------------------------------");

        System.out.println(s2.length());
        System.out.println(s2.charAt(15));
        System.out.println(s2.equals("hello"));//false

    }
}
