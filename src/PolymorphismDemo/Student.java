package PolymorphismDemo;

public class Student {

    public void stud(String name){
        System.out.println("Student name:"+name);
    }

    public void stud(int rollno,double percentage){
        System.out.println("Student Rollno:"+rollno );
        System.out.println("Student Percentage:"+percentage);
    }

    public void stud(char grade,int subjects){
        System.out.println("Student Grade:"+grade);
        System.out.println("Subjects:"+subjects);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.stud("Acchu");
        s1.stud('A',6);
        s1.stud(5,89.32);
    }
}
