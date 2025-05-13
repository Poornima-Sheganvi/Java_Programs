package Abstraction;

public class Immutable {

        private  final String name;
        private final int age;

        public Immutable(String name, int age){
            this.name=name;
            this.age=age;
        }

        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }


public static void main(String[] args) {
    Immutable im=new Immutable("Acchu",2);
    System.out.println(im.getName());
    System.out.println(im.getAge());
}
}



