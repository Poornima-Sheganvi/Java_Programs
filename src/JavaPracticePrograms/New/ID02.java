package JavaPracticePrograms.New;

public class ID02 implements InterfaceDemo1{
   public void show(){
        System.out.println("Hello world");
    }

    @Override
    public void display() {
        System.out.println("Java");
    }

    public static void main(String[] args) {
        ID02 id=new ID02();
        id.show();
        id.display();
    }
}
