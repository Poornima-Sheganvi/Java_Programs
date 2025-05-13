package Abstraction;
//hierarchical inheritance, parent is animal1
public class Dog extends Animal1 {

    public void weep(){
        System.out.println("dogs cry");
    }
    public void sound(){
        System.out.println("dogs bark");
    }

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.sound();
        d1.weep();
    }
}
