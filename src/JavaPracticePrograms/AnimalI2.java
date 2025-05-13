package JavaPracticePrograms;

public class AnimalI2 implements I02,I03{
    public  void eat(){
        System.out.println("Dog eats flesh");
    }

    public void sound(){
        System.out.println("Dog barks");
    }
    public void fly(){
        System.out.println("Birds fly");
    }

    public static void main(String[] args) {
        AnimalI2 am=new AnimalI2();
        am.eat();
        am.sound();
        am.fly();
    }
}
