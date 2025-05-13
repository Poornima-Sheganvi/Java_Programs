package InterviewPrograms.Patterns;

public class NumChangePyramidPattern {
    public static void printPyramidPattern(int n){
        int i,j;
        int num=1;

        //outer loop to handle no of rows
        for(i=1; i<=n; i++){

            //inner loop to handle no of columns
            for(j=1; j<=i; j++){

                //printing value of num in each iteration
                System.out.print(num + " ");
                //increasing the value of num
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        printPyramidPattern(n);
    }
}
