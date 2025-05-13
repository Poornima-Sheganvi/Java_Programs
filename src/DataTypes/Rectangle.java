package DataTypes;

public class Rectangle {

    public void area(int length,int width){
        int area=length*width;
        System.out.println("Area::::" + area);
    }

    private void perimeter(int length,int width ){
        int perimeter= 2*length+2*width;
        System.out.println("Perimeter::::" + perimeter);
    }

   /* protected void perimeter1(int length,int width ){
        int perimeter= 2*length+2*width;
        System.out.println("Perimeter::::" + perimeter1);
    }
*/
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.area(15,4);
        r1.perimeter(9,8);

       // r1.perimeter1(5,8);

    }
}
