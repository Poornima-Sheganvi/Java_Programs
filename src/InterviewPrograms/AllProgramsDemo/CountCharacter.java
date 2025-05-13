package InterviewPrograms.AllProgramsDemo;

public class CountCharacter {
    /*public static void main(String[] args) {
        String s="Welcome to java";
        char ch='n';
        int count=0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)==ch);
            count++;
        }
        System.out.println("Count character: " + count);
    }
*/

    public static void main(String[] args) {
        String str = "Java is a programming language";
        String rev="";
        for (int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("Original string:" +str );
        System.out.println("Reversed string: " +rev);

    }
}