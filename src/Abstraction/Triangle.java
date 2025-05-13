package Abstraction;

public class Triangle extends Shape {

    public void side(){
        System.out.println("Triangle has 3 sides");
    }

    @Override
    public void draw(){
        System.out.println("Draw triangle and its sum is 180 degrees");
    }

    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.side();
        t1.draw();
    }
}
