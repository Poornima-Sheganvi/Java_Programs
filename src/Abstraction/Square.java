package Abstraction;

public class Square extends Shape{

    public void diagonal(){
        System.out.println("Diagonals are equal in length and bisect each other at right angles. ");
    }

    public void side(){
        System.out.println("It has all the 4 sides of equal length");
    }

    @Override
    public void draw(){
        System.out.println("Draw a square, it has each angle of 90 degree");
    }

    public static void main(String[] args) {
        Square s1=new Square();
        s1.diagonal();
        s1.side();
        s1.draw();

    }
}
