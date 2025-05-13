package Abstraction;

public class Sports1 extends Sports{
    public void chess(){
        System.out.println("Chess is an indoor game");
    }
    public void volleyball(){
        System.out.println("It has 6 members in the court");
    }
    @Override
    public void sport(){
        System.out.println("There are many sports which has indoor and outdoor");
    }
    @Override
    public void cricket(){
        System.out.println("It consists of 11 members in a team");
        System.out.println("Some players can do both batting and bowling, and are called all-rounders");
    }
    @Override
    public void shotput(){
        System.out.println("Shotput has different weights");
    }
    public static void main(String[] args) {
        Sports1 sp1=new Sports1();
        sp1.sport();
        sp1.chess();
        sp1.volleyball();
        sp1.shotput();
        sp1.cricket();
    }
}
