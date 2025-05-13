package Abstraction;

public class AbsGoat extends Absanimal{

    @Override
    public void eat() {
        System.out.println("Goat eats grass");
    }

    @Override
    public void sound() {
        System.out.println("Goat sound as may may");
    }

    public void run(){
        System.out.println("goat will run");
    }

    public void color(){
        System.out.println("goat are black in color");
    }

    public static void main(String[] args) {
        AbsGoat g1=new AbsGoat();
        g1.eat();
        g1.run();
        g1.color();

    }


}
