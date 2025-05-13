package PolymorphismDemo;

    class OverrideApple extends OverrideFruits {
        void fruit1() {
            System.out.println("An Apple a day keeps doctor away");
        }

        void fruit2(){
            System.out.println("Custard Apple has more calcium");
        }

        void fruit3(){
            System.out.println("Oranges are good for health");
        }
        @Override
        public void  fruit(){
            System.out.println("there are many fruits");
        }

        public static void main(String[] args) {
            OverrideApple a1 = new OverrideApple();
            a1.fruit1();
            a1.fruit2();
            a1.fruit3();
            a1.fruit();
        }
    }
