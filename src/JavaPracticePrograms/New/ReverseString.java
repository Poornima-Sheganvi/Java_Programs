package JavaPracticePrograms.New;

public class ReverseString {
    public static void main(String[] args) {
       String str="Hello World";
       char[] chars=str.toCharArray();
        System.out.println("Reversed string:" );

        for (int i=chars.length-1; i>=0; i--){
            System.out.print(chars[i]);

        }
    }
}
