package DataTypes;

public class Car {
    private String color;
    private String model;
    private int year;

    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setColor(String color) {
        this.color = color;
    }


    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setColor("Black");
        c1.setModel("Baleno");
        c1.setYear(2022);

        System.out.println("Car Model::"+c1.getModel());
        System.out.println("Car Color::"+c1.getColor());
        System.out.println("Car Year::"+c1.getYear());

    }

}
