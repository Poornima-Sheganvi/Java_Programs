package Abstraction;
//hierarchical inheritance, parent is animal1
public class Goat extends Animal1{

    public void eat(){
        System.out.println("goat eat grass");
    }
    void color(){
        System.out.println("Goat are black in color");
    }

    public static void main(String[] args) {
        Goat g1= new Goat();
        g1.eat();
        g1.color();
    }


}
