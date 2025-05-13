package InterviewPrograms.PracticePrograms1;

import DataTypes.Test;

public class InterfaceTest1 {
    public void  show(){
        System.out.println("Interface Task");
    }
    public void step(){
        System.out.println("Interface is 100% abstraction");
    }

    public static void main(String[] args) {
        InterfaceTest1 t1=new InterfaceTest1();
        t1.show();
        t1.step();
    }
}
