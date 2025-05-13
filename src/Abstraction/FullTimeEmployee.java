package Abstraction;

public class FullTimeEmployee extends Employee1 implements EmployeeDetails{

    public void getDetails(String name, int id){
        System.out.println("Details of employee");
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        calculateSalary();
    }
    public void calculateSalary(){
        System.out.println("salary:50000");
    }

    public static void main(String[] args) {
        FullTimeEmployee f1=new FullTimeEmployee();
        f1.setId(101);
        f1.setName("John");
        f1.getDetails(f1.getName(), f1.getId());

        FullTimeEmployee f2=new FullTimeEmployee();
        f2.setId(102);
        f2.setName("Max");
        f2.getDetails(f2.getName(), f2.getId());

    }
}
