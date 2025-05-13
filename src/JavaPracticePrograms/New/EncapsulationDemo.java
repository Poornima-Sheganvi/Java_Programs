package JavaPracticePrograms.New;

public class EncapsulationDemo {
    private  String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name1){
        this.name=name1;
    }

    public void setAge(int age1) {
        this.age = age1;
    }

    public static void main(String[] args) {
        EncapsulationDemo ed=new EncapsulationDemo();
        ed.setName("Acchu");
        ed.setAge(3);
        System.out.println("Name:" +ed.getName() );
        System.out.println("Age: " +ed.getAge());
    }
}
