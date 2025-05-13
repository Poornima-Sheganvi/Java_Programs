package InterviewPrograms.PatternsDemo1;

public class PatternDemoStar {
    public static void main(String[] args) {
        for (int i=1; i<=4; i++) {
            for (int j=4; j>=i; j--){ //loop for space
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
