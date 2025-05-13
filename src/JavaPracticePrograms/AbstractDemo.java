package JavaPracticePrograms;

public class AbstractDemo {
    static  abstract class Shape{  //abstract class
        abstract  void  draw(); //abstarct method

    }
    //sub class
    static class Circle extends  Shape{ //implement abstract method
        void draw(){
            System.out.println("Drawing a circle");
        }
    }

    public static void main(String[] args) {
        Shape s1=new Circle();
        s1.draw();
    }

}
