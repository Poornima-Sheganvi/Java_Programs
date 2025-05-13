package Abstraction;

public final class Finalclass {

    public void ngo(){
        System.out.println("funds for ngo");
    }

    public void orphanage(){
        System.out.println("some amount for orphanage");
    }

    public static void main(String[] args) {
        Finalclass fc=new Finalclass();
        fc.ngo();
        fc.orphanage();
    }

}
