package Abstraction;

public class Mutable {
    private String name;
    private int age;

    public Mutable(String name, int age){
        this .name=name;
        this.age=age;
    }
    public String getName(){

        return name;
    }
    public int getAge(){

        return age;
    }
    public void setName(String name) {

        this.name = name;
    }
    public void setAge(int age) {

        this.age = age;
    }
    public void Display(){
        System.out.println("Name:"+name );
        System.out.println("Age:"+age);
    }
    public static void main(String[] args) {
        Mutable m=new Mutable("Acchu",2);
        m.Display();


    }
}
