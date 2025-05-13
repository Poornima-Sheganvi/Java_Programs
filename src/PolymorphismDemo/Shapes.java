package PolymorphismDemo;

public class Shapes {

    //perimeter of square
    public int perimeter(int a)
    {
        return 4*a;
    }

    //perimeter of rectangle
    public int perimeter(int length,int width)
    {
        return 2*(length+width);
    }

    public int perimeter(int p,int q, int r)
    {
        return p+q+r;
    }

    public static void main(String[] args) {
        Shapes s1=new Shapes();
        System.out.println("Perimeter of square:"+s1.perimeter(5));
        System.out.println("Perimeter of rectangle:"+s1.perimeter(4,6,8));
        System.out.println("Perimeter of triangle:"+s1.perimeter(3,5));

    }


}
