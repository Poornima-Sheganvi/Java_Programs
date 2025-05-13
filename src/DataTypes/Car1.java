package DataTypes;

public class Car1 {
    String color,model;
    int year;
    float milage ;
    float price;

    static void carinfo(){
        System.out.println("Car has roof top");
        System.out.println("Car onroadprice is 25lakh");
    }


    public static void main(String[] args) {
        Car1 c1=new Car1();

        System.out.println("Car color is white "  + "Car model is Nexon");
        System.out.println("Car launched in 2022");
        System.out.println("Car milage is 29.4");
        System.out.println("car price is 2500000");

        c1.carinfo();
    }
}
