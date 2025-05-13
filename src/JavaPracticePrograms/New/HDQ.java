package JavaPracticePrograms.New;

public class HDQ extends HierarchicalDEmo{
    void showQ(){
        System.out.println("Q methods");
    }

    public static void main(String[] args) {
        HDQ h=new HDQ();
        h.showQ();
        h.showP();
    }
}
