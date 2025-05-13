package InterviewPrograms.PracticePrograms1;

public class MOverriding1  extends MethodOverridingDemo1{
    void show(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        MethodOverridingDemo1 md=new MethodOverridingDemo1();
        md.show();//1

        MOverriding1 m1=new MOverriding1();
        m1.show();//hello
    }
}
