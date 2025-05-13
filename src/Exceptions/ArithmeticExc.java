package Exceptions;

public class ArithmeticExc {

    public static void main(String[] args) {
        int a=10;
        int d=0;

        int sum=a+d;
        System.out.println("Addition:"+sum);

        int sub=a-d;
        System.out.println("Subtraction:"+sub);

        try{
            int div=a/d;
            System.out.println("Division:"+div);
        }
        catch (ArithmeticException e){
            System.out.println("Error:division by zero is infinity or not allowed");
        }

    }
}
