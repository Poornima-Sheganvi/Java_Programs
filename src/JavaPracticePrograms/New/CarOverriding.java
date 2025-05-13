package JavaPracticePrograms.New;

public class CarOverriding extends MethodOverridingDemo{
    public void move(){
        System.out.println("Car is moving");
    }

    public static void main(String[] args) {
        CarOverriding c=new CarOverriding();
        c.move();
    }
}
