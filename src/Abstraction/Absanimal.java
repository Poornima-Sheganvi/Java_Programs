package Abstraction;

abstract class Absanimal {

    public abstract void eat();
    public abstract void sound();

    public void runs(){
        System.out.println("Animals run");
    }

    public static void main(String[] args) {
        Absanimal absgoat=new AbsGoat();
        absgoat.eat();
        absgoat.sound();


    }


}
