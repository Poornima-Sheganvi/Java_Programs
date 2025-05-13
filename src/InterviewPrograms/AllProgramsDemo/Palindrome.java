package InterviewPrograms.AllProgramsDemo;

//a palindrome is a sequence of characters that reads the same backward as forward.
public class Palindrome {
    public static void main(String[] args) {
        String str = "Gadag";
        String revString = "";

        int strLength = str.length();

        for (int i = strLength - 1; i >= 0; --i) {
            revString = revString + str.charAt(i);
        }
        if (str.toLowerCase().equals(revString.toLowerCase())) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
            //changed done
        }
    }
}
