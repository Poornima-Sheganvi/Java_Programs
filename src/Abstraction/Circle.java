package Abstraction;

public class Circle implements Shapes {


    @Override
    public void area() {
        System.out.println("Print area of square as A=a*a");
    }

    public void draw() {
        System.out.println("Draw a circle");
    }

    public static void main(String[] args) {
        Shapes s1 = new Circle();
        s1.area();
        s1.draw();
    }
}

