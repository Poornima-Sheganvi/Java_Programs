package Exceptions;

public class TryWithoutCatch {
    public static void main(String[] args) {
        try{
            int res=10/0;
        }
        finally {
            System.out.println("It always executes whether the exception occurs or not");
        }

    }
}
