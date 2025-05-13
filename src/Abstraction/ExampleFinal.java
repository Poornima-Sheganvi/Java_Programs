package Abstraction;

public final class ExampleFinal {

    // final variable
   /* public final double pi=3.14;

    public void circumferenceOfCircle(int r){
        double res=2*pi*r;
        System.out.println("Circumference of circle:"+res);
    }

    public static void main(String[] args) {
        ExampleFinal ef=new ExampleFinal();
        ef.circumferenceOfCircle(5);
    }*/

    //final method
    public void rules(){
        System.out.println("5 days wfo");
    }

    public final void educationCertificates(){
        System.out.println("ED father certificates");
    }

    public static void main(String[] args) {
        ExampleFinal ef=new ExampleFinal();
        ef.educationCertificates();
        ef.rules();
    }
}
