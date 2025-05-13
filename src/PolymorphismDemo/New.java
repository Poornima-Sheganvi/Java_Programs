package PolymorphismDemo;

public class New {
    void add(int a, int b){
        int a1=a+b;
        System.out.println("Addition:"+a1);
    }
    void add(double a, double b,double c){
        double d1=a+b+c;
        System.out.println("Addition:"+d1);

    }
    void add(String p,String q ){
        String s1=p+q;
        System.out.println("Addition:" + s1);
    }

    public static void main(String[] args) {
        New n1=new New();
        n1.add(5,9);
        n1.add("hi","hello");
        n1.add(9.5,2.3,3.0);
    }

}
