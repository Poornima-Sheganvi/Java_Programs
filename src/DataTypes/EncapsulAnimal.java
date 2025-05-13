package DataTypes;

public class EncapsulAnimal {

    private String name;
    private float weightInKg;
    private String gender;


    public String getName() {
        return name;
    }

    public float getWeight() {
        return weightInKg;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weightInKg = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {

        EncapsulAnimal ea = new EncapsulAnimal();
        ea.setGender("Male");
        ea.setName("Lion");
        ea.setWeight(90);

        System.out.println("Animal Name::" + ea.getName());
        System.out.println("Animal Gender::" + ea.getGender());
        System.out.println("Animal weight in kg::" + ea.getWeight());
    }
}