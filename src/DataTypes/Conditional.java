package DataTypes;

import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        /*System.out.println("Enter 2 integers:");

        int a=scan.nextInt();
        int b=scan.nextInt();
*/
       // if operator
        /*if(a>b){
            System.out.println("a is greater");
        }*/

        //if else
            /*if(a>b) {
                System.out.println("a is greater");
            }
            else {
                System.out.println("b is greater");
            }*/

        //nested if
        System.out.println("Enter 4 integers:");

        int p=scan.nextInt();
        int q=scan.nextInt();
        int r=scan.nextInt();
        int s =scan.nextInt();

        if(p>q && p>r && p>s){
            System.out.println("p is greater");
        }
        else if(q>r && q>s){
            System.out.println("q is greater");
        }
        else if(r>s){
            System.out.println("r is greater");
        }
        else {
            System.out.println("s is greater");
        }

    //switch
        

    }
}
