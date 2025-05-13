package Abstraction;
// multiple inheritance, here parent is animal1, child is lion grandchild is cub
public class Cub extends Lion{

    public void sleep(){
        System.out.println("baby lion sleeps");
    }
    public void eat(){
        System.out.println("cub eats food");
    }

    public static void main(String[] args) {
        Cub c1=new Cub();
        c1.eat();
        c1.sleep();
        c1.sound();

    }
}
