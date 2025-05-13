package InterviewPrograms.PracticePrograms1;

//method overloading demo
public class MethodOverloadingDemo1 {
     void show(int a, String b){
        System.out.println("1");
    }
    void show(String b, int a){
        System.out.println("2");
    }

    public static void main(String[] args) {
        MethodOverloadingDemo1 pd=new MethodOverloadingDemo1();

        pd.show("Poo",12);
        pd.show(10,"Hello");
    }
}
