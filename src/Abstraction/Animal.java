package Abstraction;

interface LivingThing {
    void isAlive();

}

public interface Animal extends LivingThing { //interface

    public void eat();

    public void sound();
}

abstract class Cat implements Animal{ //abstract class
    abstract void house();

}

class kitten extends Cat{

    @Override
    void house() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sound() {

    }

    @Override
    public void isAlive() {

    }
}

