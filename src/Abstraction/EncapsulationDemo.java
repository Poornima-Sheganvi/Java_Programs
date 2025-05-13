package Abstraction;

public class EncapsulationDemo {
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
        EncapsulationDemo ed=new EncapsulationDemo();
        ed.setAge(32);
        ed.setName("Shiva");
        System.out.println("Name:"+ed.getName());
        System.out.println("Age:"+ed.getAge());
    }
}
