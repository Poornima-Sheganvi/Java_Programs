package DataTypes;

public class Add1 {

    public void sum(int p, int q, int r){
        int sum=p+q+r;
        System.out.println("Sum::"+sum);
    }

    private void sub(int x,int y){
        int sub=x-y;
        System.out.println("Subtraction:" +sub);
    }

        protected void multiply(int a,int b){
            int multiply=a*b;
            System.out.println("Multiplication:" +multiply);

    }

    public static void main(String[] args) {
        Add1 a=new Add1();
        a.sum(10,89,76);

        a.sub(34,45);

        a.multiply(5,7);


    }
}
