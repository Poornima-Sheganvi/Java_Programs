package Abstraction;

abstract class Abstractclass {
    public abstract void eat();

    public void legs(){
        System.out.println( "has  legs");
    }
}

class Human extends Abstractclass{
    @Override
    public void eat() {
        System.out.println("human eats food");
    }

    public static void main(String[] args) {
        Human h1=new Human();
        h1.eat();
        h1.legs();
    }
}
