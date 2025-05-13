package Abstraction;

public interface Interfaceanimal {
    float pi = 3.242f;

    public void legs();

    public void eat();

    public void swim();

    public default void sound() {
        System.out.println("whatever Sound");
    }

    public static void sound2() {
        System.out.println("whatever Sound");
    }

}
