package Abstraction;


public class FinalExample {

    public void angles() {
        System.out.println("The sum of all 3 angles of a triangle is 180 degree");
    }

    public final void perimeterOfTriangle() {   // final method cannot be overridden
        int a = 8;
        int b = 5;
        int c = 3;//side,base,side
        int P = a + b + c;
        System.out.println("Perimeter of triangle::" + P);
    }

    public  static class Triangle extends FinalExample {
        public void angles() {
            System.out.println("The sum of each angle is 60 degree");
        }

        public static void main(String[] args) {
            Triangle t1 = new Triangle();
            t1.angles();
            t1.perimeterOfTriangle();

        }
    }
}

