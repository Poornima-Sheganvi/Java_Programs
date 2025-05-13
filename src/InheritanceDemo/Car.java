package InheritanceDemo;

public class Car extends Vehicle{

    void indicator(){

        System.out.println("Here the direction can be changed as move to left or right");
    }

    public static void main(String[] args) {
        Car c1=new Car();
        c1.drive();
        c1.indicator();

    }
}
