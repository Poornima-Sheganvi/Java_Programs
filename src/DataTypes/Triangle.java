package DataTypes;


import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        //create scanner object to take input
        Scanner scan=new Scanner(System.in);

        //ask for number of rows
        System.out.print("Enter the number of rows:");
        int rows=scan.nextInt();

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
