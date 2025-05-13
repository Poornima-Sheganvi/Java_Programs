package InterviewPrograms.PracticePrograms1;

public class C extends B{
    void showC(){
        System.out.println("c method");
    }

    public static void main(String[] args) {
        C c1=new C();
        c1.showC();
        c1.showA();
    }
}
