package InterviewPrograms.PracticePrograms1;

public class B extends  A{
    void showB(){
        System.out.println("B method");
    }

    public static void main(String[] args) {
        B b1=new B();
        b1.showB();
        b1.showA();
    }
}
