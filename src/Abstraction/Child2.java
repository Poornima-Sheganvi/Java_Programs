package Abstraction;

public class Child2 implements Example{

    public void eat(){
        System.out.println("Goat eats grass");
    }
    public void swim(){
        System.out.println("fish swims");
    }

    public static void main(String[] args) {
        Child2 c2=new Child2();
        c2.eat();
        c2.swim();
    }

}
