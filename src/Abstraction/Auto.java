package Abstraction;

public class Auto extends Vehicle{
    public void seats(){
        System.out.println("4 people can be seated here");
    }
    @Override
    public void door(){
        System.out.println("Auto has 1 door");
    }
    @Override
    public void type(){
        System.out.println("Auto can be of CNG or Chargable or Petrol ");
    }
    @Override
    public void wheels(){
        System.out.println("Auto has 3 wheels");
    }
    public static void main(String[] args) {
        Auto a1=new Auto();
        a1.door();
        a1.type();
        a1.seats();
        a1.wheels();
    }
}
