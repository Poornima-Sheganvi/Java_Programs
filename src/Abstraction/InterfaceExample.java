package Abstraction;

public class InterfaceExample implements Interface1,Interface2,Interface3,Interface4,Interface5{
    @Override
    public void dogWeep() {
        System.out.println("dogs cry");
    }
    @Override
    public void dogSound() {
        System.out.println("dogs bark");
    }
    @Override
    public void dogHouse() {
        System.out.println("dogs stay in kennel");
    }

    @Override
    public void rectangleArea() {
        System.out.println("Area=length*width");
    }
    @Override
    public void rectanglePerimeter() {
        System.out.println("Perimeter");
    }
    @Override
    public void rectangleSides() {
        System.out.println("Each angle is equal to 90 degree");
    }
    @Override
    public void carHorn() {
        System.out.println("beep beep");
    }
    @Override
    public void carWheels() {
        System.out.println("car has 4 wheels");
    }
    @Override
    public void carType() {
        System.out.println("car is of electric type");
    }
    @Override
    public void fruitApple() {
        System.out.println("An apple is good for health");
    }
    @Override
    public void fruitOrange() {
        System.out.println("Oranges are good for health");
    }
    @Override
    public void fruitPapaya() {
        System.out.println("Papaya are good for cold");
    }
    @Override
    public void sportsCricket() {
        System.out.println("Cricket has 11 members in team");
    }
    @Override
    public void sportsShotput() {
        System.out.println("Shotput varies in weight");
    }
    @Override
    public void sportsDiscuss() {
        System.out.println("Discuss throw ");
    }
    public static void main(String[] args) {
        InterfaceExample ie=new InterfaceExample();
        System.out.println("Dog details");
        ie.dogHouse();
        ie.dogSound();
        ie.dogWeep();
        System.out.println();
        System.out.println("Rectangle Details");
        ie.rectangleArea();
        ie.rectangleSides();
        ie.rectanglePerimeter();
        System.out.println();
        System.out.println("Car details");
        ie.carHorn();
        ie.carType();
        ie.carWheels();
        System.out.println();
        ie.fruitApple();
        ie.fruitOrange();
        ie.fruitPapaya();
        System.out.println();
        ie.sportsCricket();
        ie.sportsDiscuss();
        ie.sportsShotput();
    }
}
