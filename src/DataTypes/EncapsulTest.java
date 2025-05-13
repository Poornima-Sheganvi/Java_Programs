package DataTypes;

public class EncapsulTest {
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age2) {
        age=age2;
    }

    public void setName(String name2) {
        name=name2;
    }

    public static void main(String[] args) {
        EncapsulTest et=new EncapsulTest();
        et.setAge(20);
        et.setName("Appu");

        System.out.println("Person name::"+et.getName());
        System.out.println("Person age::"+et.getAge());

    }

}
