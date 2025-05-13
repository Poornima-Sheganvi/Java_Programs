package Abstraction;

public class Bicycle extends Vehicle{

    public void brand(){
        System.out.println("The cycle brand is Hero");
    }

    @Override
    public void door(){
        System.out.println("Bicycle don't have door");
    }

    @Override
    public void type(){
        System.out.println("Cycle can be of type gear or normal one ");
    }

    @Override
    public void wheels(){
        System.out.println("It has two wheels");
    }

    public static void main(String[] args) {
        Bicycle b1 =new Bicycle();
        b1.brand();
        b1.door();
        b1.type();
        b1.wheels();
    }
}
