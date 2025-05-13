package InterviewPrograms.Patterns;

public class NumDecrPyramidPattern {
    public static void printDecrPattern(int n){
        int i,j;

        //outer loop to handle no of rows
        for(i=n; i>=1; i--){

            //inner loop
            for(j=1; j<=i; j++){

                //printing column values
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=6;
        printDecrPattern(n);
    }
}
