package Constructors;

public class TestData {

    private int number;
    private String s;

    public TestData(){
        number=30;
        s="Acchu";
    }


    public void display(){
        System.out.println("This display the number:"+number);
        System.out.println("Display the name:"+s);
    }

    public static void main(String[] args) {
        TestData td=new TestData();
        td.display();
    }
}
