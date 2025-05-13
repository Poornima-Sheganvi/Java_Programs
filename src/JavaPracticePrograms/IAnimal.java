package JavaPracticePrograms;

public interface IAnimal {
    void sound();
    void  eat();
}
class Dog1 implements IAnimal{
    public void sound(){
        System.out.println("Dog barks");
    }


    public void eat() {
        System.out.println("Dog eats flesh");
    }
}
