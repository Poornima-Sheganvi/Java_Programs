package JavaPracticePrograms.New;

public class HQR extends HierarchicalDEmo{
    void showR(){
        System.out.println("R methods");
    }

    public static void main(String[] args) {
        HQR h1=new HQR();
        h1.showR();
        h1.showP();
    }
}
