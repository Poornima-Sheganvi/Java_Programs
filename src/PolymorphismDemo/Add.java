package PolymorphismDemo;
 class Add extends Calculator{

    public void sum(int p, int q, int r){
        int a = p+q+r;
        System.out.println("Addition :"+a);
    }

    public void sub(int d,int d1){
        int dd=d-d1;
        System.out.println("Subtraction : "+dd);
    }
    @Override
    public void add(int a, int b){
        int s=a;
        System.out.println("Display the a value :"+s);
    }

    public static void main(String[] args) {
        Add a1=new Add();
        a1.sub(8 , 3);
        a1.sum(2,4,7);
        a1.add(3,7);
    }
}
