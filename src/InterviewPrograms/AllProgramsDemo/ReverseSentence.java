package InterviewPrograms.AllProgramsDemo;

public class ReverseSentence {
    public static void main(String[] args) {
        String sent=" Java is a programming language";


        //split the string into words
        String[] words=sent.trim().split("");

        //use stringbuilder to build the reversed string
        StringBuilder reversedString=new StringBuilder();

        for (int i=sent.length()-1; i>=0;i--){
            reversedString.append(words[i] + " ");
        }

    }

}
