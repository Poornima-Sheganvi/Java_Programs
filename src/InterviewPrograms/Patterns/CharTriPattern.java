package InterviewPrograms.Patterns;

public class CharTriPattern {
    public static void printCharPattern(int n){
        int i,j;
        char ch='A';
        for ( i=1; i<n; i++){
            for (j=1; j<=i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        printCharPattern(n);
    }
}
