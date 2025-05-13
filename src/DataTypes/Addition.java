package DataTypes;

public class Addition {
    public int MAX = 20;
    private int MIN = 20;

    private void newAddition(int p,int q){
        int sum = p + q;
        System.out.println("The Sum is:"+sum+ "MIN:"+MIN);
    }

    protected void updatedAdditionMethod(int a,int b){
        int sum = a + b;
        System.out.println("The Sum is:"+sum+ "MIN:"+MIN);
    }

    public static void main(String[] args) {

        Addition add = new Addition();
        add.newAddition(17,40);
        add.updatedAdditionMethod(22,10);
    }
}


