package InterviewPrograms.AllProgramsDemo;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /*int num=5;
        int fact=1;
        for (int i=1; i<=num; i++){
            fact=fact*i;
        }
        System.out.println("Factorial="+ fact);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        //int i=1,
        int fact=1;
       /* while (i<=num){
            fact=fact*i;
            i++;
        }*/
        for (int i=1; i<=num ; i++){
            fact=fact*i;

        }
        System.out.println("Factorial:" + fact);
        //changed the program


    }
}
