package DataTypes;

public class Student1 {
    String name="Arjun";
    int roll_no=17;
    int age=8;
    float fees=4500.90f;
    char grade='A';

    public static void main(String[] args) {
        Student1 s1=new Student1();
        System.out.println("Student name is: " +s1.name);
        System.out.println("Student roll_no is: " +s1.roll_no);
        System.out.println("Student age is: " +s1.age);
        System.out.println("Student fees is: " +s1.fees);
        System.out.println("Student grade is: " +s1.grade);

    }
}
