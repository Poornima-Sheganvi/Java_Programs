package Exceptions;

public class MultipleCatch {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            System.out.println("Division not possible by zero");
        }


        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception occurs");
        }

    }




}
