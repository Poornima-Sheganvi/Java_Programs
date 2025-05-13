package Exceptions;

public class ThrowsExample {

    public static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            System.out.println("Access denied:should be atleast 18 years old");
        } else {
            System.out.println("Access granted: eligible to vote");
        }
    }

    public static void main(String[] args) {
        checkAge(9);
    }

    }

