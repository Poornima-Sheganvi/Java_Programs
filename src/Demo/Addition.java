package Demo;

public class Addition {

    public void add(int a,int b){
        int add=a+b;
        System.out.println("Addition::"+add);
    }

    private void sum(int p, int q, int r){
        int sum=p+q+r;
        System.out.println("Addition::"+sum);

    }

    protected void sum1(int p, int q, int r){
        int sum=p+q+r;
        System.out.println("Addition::"+sum);

    }

   /*  void sum2(int p, int q, int r){
        int sum=p+q+r;
        System.out.println("Addition::"+sum);*/



    public static void main(String[] args) {
        Addition a=new Addition();
        a.add(50,34);
        a.sum(9,89,67);
        a.sum1(4,16,36);



    }
}
