package InterviewPrograms.Patterns;

import java.util.Scanner;

public class DiamondStarProgram {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);  //scanner class declaration
            System.out.print("Enter number of row:"); //taking user input
            int n = sc.nextInt();
            //declare for loop for print first pyramid
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
//declare for loop for print reverse pyramid
        for (int i=n-1; i>0;i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
