package DataTypes;

public class Fibonacci {

    public static void main(String[] args) {
        int n=8,p1=0,p2=1;
        System.out.println("Fibonacci Series :");
        for(int i=1; i<=n; i++){

            System.out.println(p1);

            int sum=p1+p2;
            p1=p2;
            p2=sum;
        }
    }
}
