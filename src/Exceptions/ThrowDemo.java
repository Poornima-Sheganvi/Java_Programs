package Exceptions;

public class ThrowDemo {
    public static void checkAgeForVoting(int age){
        if(age>=18){
            System.out.println("Allow the voter to vote");
        }
        else {
            throw new IllegalArgumentException("Age must be 18 or above ");
        }

    }

    public static void main(String[] args) {
        ThrowDemo.checkAgeForVoting(16);  // method is followed by static, so we call directly by classname

    }
}
