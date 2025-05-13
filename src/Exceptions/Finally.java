package Exceptions;

public class Finally {

    public static void main(String[] args) {
        try{
            float data=25/0;  // divide by 0 means wee get arithmetic exception
            System.out.println(data);
        }
        catch (ArrayIndexOutOfBoundsException p){   // ArrayIndexOutOfBoundsException will not be handled, it should be handled by arithmetic exception
            System.out.println(p);
        }
        finally {
            System.out.println("finally block will always gets executed");
        }
    }
}
