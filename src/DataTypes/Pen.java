package DataTypes;

public class Pen {
    String color;
    String brand;
    String type;

    //method for pen
    static void write(){
        System.out.println("Pen does the writing activity");
    }

    public static void main(String[] args) {
        Pen p1=new Pen();

        System.out.println("Pen brand: Reynolds");
        System.out.println("Pen is of color: Red");
        System.out.println("Pen of type: Gel_Pen");

        Pen.write();
    }
}
