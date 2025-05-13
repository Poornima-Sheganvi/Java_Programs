package PolymorphismDemo;

public class OverrideLion extends OverrideAnimal {

    void legs() {
        System.out.println("Lion has four legs");
    }

    void eat() {
        System.out.println("Lion eats flesh of other animal");
    }

    void fur() {
        System.out.println("Lion has hairs on body");
    }

    @Override
    public void sound() {
        System.out.println("Lion roars");
    }

    public static void main(String[] args) {
        OverrideLion l1 = new OverrideLion();
        l1.legs();
        l1.eat();
        l1.fur();
        l1.sound();
    }
}
