package Abstraction;

public class Employee {

    private String name;
    private int id;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Employee e1=new Employee();
        //before set
        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());

        e1.setName("Sara");
        e1.setId(101);
        e1.setSalary(50000);
        //e1.setSalary(10000);

        //after set
        System.out.println(e1.getId());
        System.out.println(e1.getName());


        if(e1.getSalary()<=20000){
            System.out.println("Basic Salary");
        }
        else{
            System.out.println(e1.getSalary());
        }

    }

}
