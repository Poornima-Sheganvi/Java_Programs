package DataTypes;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter two digits:");
        int a=scan.nextInt();
        int b= scan.nextInt();

        System.out.println("add :" +(a+b));
        System.out.println("sub :" +(a-b));
        System.out.println("mul :" +(a*b));
        System.out.println("div :" +(a/b));

    }
}
