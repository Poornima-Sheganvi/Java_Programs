package Exceptions;

public class NullPointer {

    public static void main(String[] args) {
        String str=null; //initializing string variable to null

        try{
            int length=str.length(); //call method on null reference
            System.out.println("Length of string:"+length);
        }

        catch (NullPointerException e){
            System.out.println("Error:Null reference");
        }

        }

}
