package Abstraction;

public class Child extends InheritanceDemo{

    public void sound(){
        System.out.println("birds chirp");
    }
    public void eat(){
        System.out.println("birds eat insects");
    }

    public static void main(String[] args) {
        Child c1=new Child();
        c1.eat();
        c1.sound();
    }
}
