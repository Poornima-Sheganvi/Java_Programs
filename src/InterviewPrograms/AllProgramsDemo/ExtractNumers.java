package InterviewPrograms.AllProgramsDemo;

public class ExtractNumers {
    public static void main(String[] args) {
        String s1="shiva890@$2p&^$oo245achu17";
        System.out.println("Input:" +s1);

        String num1=s1.replaceAll("[^0-9]","");
        System.out.println("Numbers: " + num1);
/*
        //either any one can be used
        String num2=s1.replaceAll("[\\D]", "");  //regex: regular expression
        System.out.println("Numbers: " +num2);*/
    }
}
