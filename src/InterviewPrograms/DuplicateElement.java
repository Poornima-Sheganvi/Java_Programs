package InterviewPrograms;

import java.util.Arrays;

//Practice programs

public class DuplicateElement {
    public static void main(String[] args) {
//        String d = "99.98";
//        //int result = Integer.parseInt(d);
//        double result=Double.parseDouble(d);
//        int r1=(int)result;
//        System.out.println(r1);
//        System.out.println((float)r1);
//
//        String s1="767hbkjhkj";
//        boolean b=Boolean.parseBoolean(s1);
//        if(b==true)
//        {
//            System.out.println("True");
//        }
//        else
//            System.out.println("False");
        Object[] o1={100, "897y89", true, 'A'};
        String[] s= new String[10];
        System.out.println(s.length);
        System.out.println(s[0]);
        s[0]="Shiva";
        System.out.println(s[0]);
        s[0]="Poornima";
        System.out.println(s[0]);
        System.out.println(Arrays.toString(s));

        int[][] intArray2D=new int[3][4];// {{0,0, 0, 0}, {0,0, 0, 0},{0,0, 0, 0}}
        //                                      0               1       2
        System.out.println(Arrays.toString(intArray2D));
        System.out.println(Arrays.toString(intArray2D[0]));
        System.out.println(Arrays.toString(intArray2D[1]));
        System.out.println(Arrays.toString(intArray2D[2]));

        char c='j';
        System.out.println(Character.isLetter(c));
        char c2=650;
        System.out.println(c2);

    }


}
