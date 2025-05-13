package Constructors;

public class Student {

    private int roll_num;
    private String name;
    private String combination;

    public Student(int roll_num,String name,String combination){
        this.roll_num=roll_num;
        this.name=name;
        this.combination=combination;


    }

    public void displayStudentDetails(){
        System.out.println("Student details :");
        System.out.println("roll number::" +this.roll_num + " name::"+this.name + " combination::" +this.combination);

    }

    public static void main(String[] args) {
        Student s1=new Student(12,"Acchu","pcmb");
        s1.displayStudentDetails();
    }
}
