package InterviewPrograms.AllProgramsDemo;

public class PrintIntCharSpec {
    public static void main(String[] args) {
        String str="ABC7892@#$of!*qw";
        System.out.println("Input: " + str);

       String charac=str.replaceAll("[^A-Za-z]","");
        System.out.println("Characters: " + charac);

        String special=str.replaceAll("\\w", "");
        System.out.println("Special characters: " +special);

        String num=str.replaceAll("\\D", "");
        System.out.println("Numbers: " +num);
    }
}
