package Abstraction;

public class Encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Encapsulation e1=new Encapsulation();
        e1.setName("Acchu");
        e1.setAge(3);

        System.out.println("Name:"+e1.getName());
        System.out.println("Age:"+e1.getAge());
    }
}

