package Abstraction;

public class Ione implements Interfaceanimal {
    //birds class
    @Override
    public void legs() {
        System.out.println("Birds have 2 legs 2 wings");
    }

    @Override
    public void eat() {
        System.out.println("Insects");
    }

    @Override
    public void swim() {
        System.out.println("No swimming");
    }

    public static void main(String[] args) {
        System.out.println(Interfaceanimal.pi);
        Interfaceanimal.sound2();
        Ione i1 = new Ione();
        i1.legs();
        i1.swim();
        i1.sound();
    }


}
