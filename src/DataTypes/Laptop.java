package DataTypes;

public class Laptop {
    String laptopName ="Dell";
    float price =35000.00f;
    String generation="i3";
    boolean isItTouchScreen;


    public static void main(String[] args) {
        Laptop l1=new Laptop();
        System.out.println("Laptop is of Dell Company");
        System.out.println("the price is 35000 ");
        System.out.println("it is of i3 generation");
        //System.out.println(" the laptop is not touchscreen");
        System.out.println("check whether laptop is touchscreen or not:" +l1.isItTouchScreen);

    }
}
