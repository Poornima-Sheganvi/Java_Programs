package InterviewPrograms.PracticePrograms1;

public class VScooter extends  Vehicle2{
    void start(){
        System.out.println("scooter starts with kick");
    }

    public static void main(String[] args) {
        VCar2 v=new VCar2();
        v.start();

        VScooter v1=new VScooter();
        v1.start();
    }
}
