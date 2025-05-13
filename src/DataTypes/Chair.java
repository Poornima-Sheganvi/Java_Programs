package DataTypes;

public class Chair {
    float chairCapacityInKg = 100.898f;
    String color= "Brown";
    String brand="Nilkamal";
    float heightInFeet=3f;


    public static void main(String[] args) {
        Chair c1=new Chair();

        System.out.println("Chair capacity in kg is:" +c1.chairCapacityInKg);
        System.out.println("Chair color is:" +c1.color);
        System.out.println("Chair brand:" +c1.brand);
        System.out.println("Chair heightInFeet:" +c1.heightInFeet);



    }
}
