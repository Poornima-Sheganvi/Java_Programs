//program for number divisible by 3 and print it


package Exceptions;

public class ArrayExample {
    public static void main(String[] args) {
        int [] num={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<num.length;i++){
            if(num[i]%3==0){   // check for reminder, like 1%4(3)==0(false)
                System.out.println(num[i]);
            }
        }
    }

}
