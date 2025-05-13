package Abstraction;

public class Rectangle extends Shape{

    public void area(){
        System.out.println("The area of rectangle is calculated as length*width ");
    }

    @Override
    public void draw(){
        System.out.println("Draw Rectangle its interior sum is equal to 360 degrees ");
        System.out.println("The opposite sides are parallel and equal to each other");
    }

    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.area();
        r1.draw();
    }
}
