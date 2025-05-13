package InterviewPrograms.AllProgramsDemo;

public class Car implements Vehicle {
    public void start(){
        System.out.println("Car starts");
    }
    public void stop(){
        System.out.println("Car stops");
    }

    public static void main(String[] args) {
       Vehicle v1=new Car();
       v1.start();
       v1.stop();

    }
}
