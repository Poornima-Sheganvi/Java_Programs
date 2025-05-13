package DataTypes;

public class EncapsulChair {

    private String color ;
   private String brand;
    float heightInFeet=3f;

    public String getColor() {
        return color;
    }
    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static void main(String[] args) {
        EncapsulChair ch=new EncapsulChair();
        ch.setColor("Brown");
        ch.setBrand("Nilkamal");

        System.out.println("Chair Color::"+ch.getColor());
        System.out.println("Chair Brand::"+ch.getBrand());
    }
}
