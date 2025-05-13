
package Exceptions;


import java.util.Arrays;

public class ArraySortDemo1 {

    public static void demoArrays() {
        int[] numbers = {10, 20, 30, 40, 50, 50, 2, 43, 6, 7, 8, 9, 0, 1, 2, 4, 5, 6};
        //0,1,2,3,
        //Know the size of the array
        int arraySize = numbers.length;

        //Fetch the 3rd element in the array

        int thirdElement = numbers[3 - 1];
        System.out.println("Size of the arrays is :::" + arraySize);

        System.out.println("Third element is :::" + thirdElement);

        // I want to print all the numbers in the arrays

        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.println("Array elements are :::" + numbers[i]);
        }
    }

    public static void searchArrays(int[] array, int searchElement) {
        //Step1 : int[] num = { 10, 2, 6 , 7 , 8 , 9, 11 , 13 , 14 }; SE: 6
        boolean found = false;
        for (int i = 0; i <= array.length - 1; i++) {
            int element = array[i]; // 6
            if (searchElement == element) { // 6 == 6
                found = true;
                System.out.println("Search element found " + searchElement + " and index is at ::" + i);
                break;
            }
        }

        if (found == false) { // found == false
            System.out.println("Search element " + searchElement + " not found in the arrays ");
        }
    }

    public static void sortByInbuiltFunction(int[] array) {
        System.out.println("Unsorted array is :::" + Arrays.toString(array));
        // Java provides the inbuilt function to sort the arrays using Arrays.sort method
        Arrays.sort(array);
        // ASC order
        System.out.println("Sorted  array in ASC order :::" + Arrays.toString(array));

        System.out.println("Desc order ");
        // 1 , 2 , 3 , 4 , 5
        // 5 , 4, 3, 2, 1
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) {
        //demoArrays();
        int[] num = {10, 2, 6, 7, 8, 9, 11, 13, 14};
        int searchElement = 123;
        //searchArrays(num,searchElement);

        int[] unSorted = {5, 1, 4, 3, 2};
        // Sort the array
        // 1,2,3,4,5 -> ASC
        // 5,4,3,2,1 -> Desc
        searchArrays(unSorted,2);


    }
}



