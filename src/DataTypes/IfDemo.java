package DataTypes;

public class IfDemo {

    public static void main(String[] args) {
        int age=25;
        if(age>=18){
            System.out.println("eligible for vote");
            if(age>=25){
                System.out.println("eligible to become cm");
            }
            else{
                System.out.println("not eligible to become cm");
            }
        }
        else{
            System.out.println("not eligible for vote");
        }
    }

}
