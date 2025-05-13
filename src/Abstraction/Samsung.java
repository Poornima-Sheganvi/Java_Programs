package Abstraction;

//polymorphism overriding
public class Samsung extends Mobile{
    public void name(){
        System.out.println("Mobile is samsung and has front camera with 64 mega pixel");
    }
    public void price(){
        System.out.println("Price is 15000 and 4 inch");
    }

    public static void main(String[] args) {
        Samsung s1=new Samsung();
        s1.name();
        s1.price();

    }


}
