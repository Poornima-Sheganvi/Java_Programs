package Constructors;

public class Student1 {

    int id;
    String name;

        Student1(){
            System.out.println("Student is created");
        }
    void display(){
        System.out.println(id+" "+name  );
    }

    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.display();


    }
}
