package InterviewPrograms.Patterns;

public class NumbTrianglePattern {

    public static void printPattern(int n){
        int i,j;

        //outer loop to handle no of rows
        for( i=1; i<=n; i++){

            //inner loop to print space
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop to print star
            for(j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            //print new line for each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        printPattern(n);
    }
}
