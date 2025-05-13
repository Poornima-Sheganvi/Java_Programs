package JavaPracticePrograms.New;

public class AbsCat extends AbstractDemo{
    public void animalSound(){
        System.out.println("The cat says meow");
    }
   /* public void sleep(){
        System.out.println("cat is sleeping");
    }*/

    public static void main(String[] args) {
        AbsCat cat=new AbsCat();
        cat.animalSound();
        cat.sleep();
    }

}
