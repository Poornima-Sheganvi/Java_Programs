package InterviewPrograms.Patterns;

public class ZeroOneTriPattern {
    public static void printZeroPatern(int n){
        int i,j;

        //outer loop to handle no of rows
        for(i=1; i<=n; i++){

            //inner loop to handle no of columns
            for(j=1; j<=i; j++){

                //if sum(i+j) is even then print 1
                if((i+j)%2==0){
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        printZeroPatern(n);
    }
}
