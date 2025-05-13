package InheritanceDemo;

public class Bike extends Vehicle {
    void seat() {
        System.out.println("Only two people can be seated");
    }

    public static void main(String[] args) {
        Bike b1=new Bike();
        b1.seat();
        b1.drive();
        b1.brake();
        b1.gear();
    }
}
