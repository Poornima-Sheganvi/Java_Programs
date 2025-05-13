package InterviewPrograms.Patterns;

public class PalindromePattern {
    public static void printPalindromeNum(int n){
        int i,j;

        //outer loop to handle no of rows
        for(i=1; i<=n; i++){

            //inner loop to print the spaces
            for(j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //inner loop to print the first part
            for(j=i; j>=1; j--){
                System.out.print(j + " ");
            }
            //inner loop to print the second part
            for(j=2; j<=i; j++){
                System.out.print(j + " ");
            }
            //print new line for each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        printPalindromeNum(n);
    }
}
