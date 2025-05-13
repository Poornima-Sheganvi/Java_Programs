package DataTypes;

public class Fridge {
    String color;
    String brandName;
    int doors;
    int temperature;
    boolean isFridgeOff;



    public static void main(String[] args) {
        Fridge f1=new Fridge();

        System.out.println("Fridge name is: Whirlpool");
        System.out.println("Fridge color is: grey");
        System.out.println("Fridge had the doors: 2");
        System.out.println("Fridge temperature is: 45");
        System.out.println("Fridge is on or off: ON");
        System.out.println("Fridge is on or off: " +f1.isFridgeOff);

    }
}
