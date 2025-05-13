package DataTypes;

public class EncapsulFruits {

    private String fruit_name;
    private int numberOfPieces;
    private float pricePerKg;

    public String getFruit_name() {
        return fruit_name;
    }
    public int getNumberOfPieces() {
        return numberOfPieces;
    }
    public float getPricePerKg() {
        return pricePerKg;
    }

    public void setFruit_name(String fruit_name) {
        this.fruit_name = fruit_name;
    }
    public void setNumberOfPieces(int numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
    }
    public void setPricePerKg(float pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public static void main(String[] args) {
        EncapsulFruits ef=new EncapsulFruits();
        ef.setFruit_name("Orange");
        ef.setNumberOfPieces(12);
        ef.setPricePerKg(70);

        EncapsulFruits ef1=new EncapsulFruits();
        ef1.setFruit_name("Apple");
        ef1.setNumberOfPieces(8);
        ef1.setPricePerKg(250);

        System.out.println("Fruit Name::"+ef.getFruit_name());
        System.out.println("Number of pieces::"+ef.getNumberOfPieces());
        System.out.println("Price per kg::"+ef.getPricePerKg());

        System.out.println("Fruit Name::"+ef1.getFruit_name());
        System.out.println("Number of pieces::"+ef1.getNumberOfPieces());
        System.out.println("Price per kg::"+ef1.getPricePerKg());
    }
}
