package InterviewPrograms.PracticePrograms1;

public class Puppy1 extends Dog1{
    void run(){
        System.out.println("Puppy can run");
    }

    public static void main(String[] args) {
        Puppy1 p1=new Puppy1();
        p1.run();
        p1.eat();
        p1.walk();

    }
}
