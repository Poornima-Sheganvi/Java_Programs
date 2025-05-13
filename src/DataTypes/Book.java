package DataTypes;

public class Book {
    int noOfPages=200;
    String size="long";
    String type="ruled";

    static void write(){
        System.out.println("We can add content in book");
    }
    static void types(){
        System.out.println("pages are ruled or pages are white");
    }


    public static void main(String[] args) {
        Book b1=new Book();

        System.out.println("book has 200 pages");
        System.out.println("book is of long size");
        System.out.println("book has pages of rule type");

        b1.write();
        b1.types();

    }
}
