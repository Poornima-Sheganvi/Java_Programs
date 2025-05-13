package InterviewPrograms.Patterns;

public class NumIcrPyramidPattern {

    //fun to demonstrate pattern
    public static void printPyramidPattern(int n){
       int i,j;

       //outer loop to handle no of rows
        for(i=1;i<=n;i++){
            //inner loop to handle no of columns
            for(j=1; j<=i; j++){

                //printing column values
                System.out.print(j + " ");
            }
            //print new line for each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        printPyramidPattern(n);
    }
}
