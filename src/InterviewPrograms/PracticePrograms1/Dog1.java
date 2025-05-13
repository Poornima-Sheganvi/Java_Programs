package InterviewPrograms.PracticePrograms1;

public class Dog1 extends Animal1 {
    void eat(){
        System.out.println("Dog eats flesh");
    }

        public static void main(String[] args) {
            Animal1 a1=new Animal1();
            a1.eat();
            a1.walk();

            Dog1 d1=new Dog1();
            d1.eat();
        }

}
