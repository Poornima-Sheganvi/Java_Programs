package InterviewPrograms.Strings;

//How to reverse the words in the string?
public class ReverseWordsTask {
    public static void main(String[] args) {
        String s1 = "Java is a programming language";
        String s2 = "";

        for (int i = 0; i < s1.length(); i++) {
            s2 = s1.charAt(i) + s2;

        }
      String s3= s2.concat(" Hello");
        //System.out.println(s3);
       
        System.out.println("Input : " + s1);
        System.out.println("Reversed String : " + s3);
    }
}
