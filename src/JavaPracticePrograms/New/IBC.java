package JavaPracticePrograms.New;

//multilevel inheritance
public class IBC extends IDB{
    void showC(){
        System.out.println("C methods");
    }

    public static void main(String[] args) {
        IBC i=new IBC();
        i.showC();
        i.showB();
        i.showA();


    }
}
