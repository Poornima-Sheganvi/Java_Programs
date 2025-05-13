package InterviewPrograms.Collections;

import java.util.ArrayList;
import java.util.Arrays;

//task
// create empty array , add 1-20 numbers
public class ArrayDEmo {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i <=20; i++) {
            num.add(i);
        }
        System.out.println(num);

//        int[] nums ={1, 20, 30};//leng=3
//        int[] num2=new int[]{20, 30, 40, 50};//len=4
//        int[] num3=new int[20];//len-20
//        System.out.println(Arrays.toString(num3));
//        for (int i = 0; i <20; i++) {
//           num3[i]=i+1;//num3[1]=1
//        }
//        System.out.println(Arrays.toString(num3));


        int[] num4=new int[20];
        System.out.println(Arrays.toString(num4));
        for (int i=20; i>0; i--){
            num4[num4.length-i]=i;
        }
        System.out.println(Arrays.toString(num4));
    }
}
