package JavaPracticePrograms.New;

public class MethodOverloadingDemo {

    void show(int a, String b){
        System.out.println("Method overloading");
    }
    void show(String a, int b){
        System.out.println("Same class,same name but different parameters");
    }

    public static void main(String[] args) {
        MethodOverloadingDemo md=new MethodOverloadingDemo();
        md.show(4,"Hello");
        md.show("Java",7);
    }

}
