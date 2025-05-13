
package Exceptions;

public class UncheckedExcep {
    public static void main(String[] args) {

        try{
            int[] a = {1, 3, 5, 7, 9};
            System.out.println(a[8]);
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Index does not exist");
        }

    }

    }

       /* String s = null;
        System.out.println(s.length());
    }
}*/


/*try {
            int[] a = {1, 3, 5, 7, 9};
            System.out.println(a[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index does not exist");
        }
*//*





        */
/*int x=20;
        int y=0;
        try{
            int z=x/y;
            System.out.println(z);
        }
        catch (ArithmeticException ae){
            System.out.println("Number cannot be divided by zero");
        }*//*


    }
}
*/
