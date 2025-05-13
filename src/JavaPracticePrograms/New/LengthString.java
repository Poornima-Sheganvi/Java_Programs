package JavaPracticePrograms.New;

public class LengthString {
    public static void main(String[] args) {
        String s1="Java is a programming language";
        int count=0;
        for (char c: s1.toCharArray()){
            count++;
        }
        System.out.println("Length of string: " +count);



    }
}
