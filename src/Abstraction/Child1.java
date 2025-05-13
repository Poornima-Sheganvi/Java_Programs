package Abstraction;

public class Child1 extends InheritanceDemo{

    public void sound() {
        System.out.println("goat says may");
    }



    public static void main(String[] args) {
        Child1 c1=new Child1();
        c1.eat();
        c1.sound();
    }
}
