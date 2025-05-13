package Abstraction;

public class Fibonacci1 {
    public static void main(String[] args) {
        int p=0, q=1, r;
        int n=8;

        for(int i=0;i<n;i++){
            System.out.println(p);
            r=p+q;
            p=q;
            q=r;
            //System.out.println("Fibonacci");
            //System.out.println(q);
        }
    }




}

