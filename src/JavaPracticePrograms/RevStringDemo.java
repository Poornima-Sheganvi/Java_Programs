package JavaPracticePrograms;

import java.util.Scanner;

public class RevStringDemo {

   /* public static void main(String[] args) {

            String name="Appu";
            int length=name.length();
            String rev="";
            for(int i=length-1; i>=0; i--)
            {
                rev=rev+name.charAt(i);
            }
        System.out.println("Original value:" + name);
        System.out.println("Reverse name: " +rev);

        }*/



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = 0;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                temp = temp + 1;
            }
            if (temp == 0) {
                System.out.println("Number is prime");

            } else {
                System.out.println("Number is not prime");

            }
        }
    }

}


