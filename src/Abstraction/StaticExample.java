package Abstraction;

public class StaticExample {

    public static double PI=3.14d;         //static variable
     static int r=8;

    public static void CicumferenceOfTheCircle(){    // static method

        double result=2*StaticExample.PI*r;
        System.out.println("Circumference of the circle :"+result);
    }

    public void areaOfCircle(){  //non static method

        double Res=StaticExample.PI*r*r;
        System.out.println("Area of Circle:"+Res);
    }

    public static void main(String[] args) {

        StaticExample.CicumferenceOfTheCircle(); // we use class name here

        StaticExample se=new StaticExample();// for non static need to create object
        se.areaOfCircle();

    }
}
