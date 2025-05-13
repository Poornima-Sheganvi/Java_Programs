package Abstraction;

public class Lorry extends Vehicle {
    public void horn(){
        System.out.println("The horn says beep beep");
    }
    public void wiper(){
        System.out.println("Used to clean the glass ");
    }
    @Override
    public void type(){

        System.out.println("The vehicle is Diesel type");
    }
    @Override
    public void wheels(){
        System.out.println("Lorry has 8 wheels");
    }
    @Override
    public  void door(){
        System.out.println("Lorry has 2 doors");
    }
    public static void main(String[] args) {
        Lorry Lorry=new Lorry();
        Lorry.door();
        Lorry.wheels();
        Lorry.type();
        Lorry.horn();
    }
}
