package DataTypes;
import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the number of terms for fibonacci series:");
        int n=s.nextInt(); //s is object of scanner

        if(n<=0) {
            System.out.println("Enter the digit");
        }

        int p1=0,p2=1; //initialize the first two terms

        for(int i=1; i<=n; i++){
            System.out.println(p1 + " ");
            int sum=p1+p2;
            p1=p2;
            p2=sum;

        }
        EncapsulTest e1=new EncapsulTest();
        System.out.println(e1.getName());
        System.out.println(e1.getAge());

        Car c1=new Car();
        System.out.println(c1.getColor());
        System.out.println(c1.getModel());
        System.out.println(c1.getYear());

    }
}
