package PolymorphismDemo;

//public class Dog {

    class Dog extends OverrideAnimal{

        void bark() {
            System.out.println("Dog Barks");
        }

        void weep(){
            System.out.println("Dogs make some different sound like weeping");
        }

        void eat(){
            System.out.println("Dogs eat veg and non veg");
        }

        public static void main(String[] args) {
            Dog d1=new Dog();
            d1.bark();
            d1.eat();
            d1.weep();
        }
    }


