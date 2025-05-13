package InterviewPrograms.AllProgramsDemo;

//Write a java program to reverse
public class ReverseString {
    public static void main(String[] args) {
        String s2="Hello";
        char ch;
        String r="";

        for (int i=0; i<s2.length(); i++){
            ch=s2.charAt(i);

            r=ch+r;
        }
        System.out.println("Input: " +s2);
        System.out.println("Reversed string: "+r);

    }
}
