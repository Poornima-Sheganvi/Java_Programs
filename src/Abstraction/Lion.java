package Abstraction;
//single inheritance
public class Lion extends Animal1{

    public void eat(){
        System.out.println("Lion eats flesh");
    }
    public void sound(){
        System.out.println("Lion roars");
    }

    public static void main(String[] args) {
        Lion l1 =new Lion();
        l1.eat();
        l1.sound();
    }
}
