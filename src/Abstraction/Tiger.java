package Abstraction;

public class Tiger implements Interfaceanimal{
    @Override
    public void legs() {
        System.out.println("4");
    }

    @Override
    public void eat() {
        System.out.println("meat");
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }
}
