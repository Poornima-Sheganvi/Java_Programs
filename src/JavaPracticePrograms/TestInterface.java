package JavaPracticePrograms;

public class TestInterface implements I1, I2 {
    public void show() {
        System.out.println("1");
    }

    public void display() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        TestInterface t1 = new TestInterface();
        t1.show();
        t1.display();
    }

}
