package InterviewPrograms.PatternsDemo1;

public class PentagonPatternNew {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {  //outer loop
            for (int j = i; j < n; j++) {  //loop for space
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { //loop to print *
                System.out.print("* ");
            }
            System.out.println();
        }
       //square
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    }









/*int n=5;
        for (int i=1; i<=n; i++){  //outer loop
        for (int j=i; j<n; j++){  //loop for space
        System.out.print(" ");
            }
                    for (int k=1; k<=i; k++){ //loop to print *
        System.out.print("* ");
            }
                    System.out.println();
        }
                //square
                for (int i=1; i<=n; i++){
        for (int j=1; j<=n; j++){
        System.out.print("* ");
            }
                    System.out.println();
        }*/


































        /*for (int i=1; i<=4; i++){
            for (int j=4; j>=i; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            *//*for (int l=2; l<=i; l++){
                System.out.println("*");
            }*//*
            System.out.println();
        }
*/
      /*  for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 6; j++)
                System.out.print("* ");
            System.out.println();
        }*/
       /* for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 7-i; j++) {
                if (j % 2 == 0)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }*/


