package Exceptions;

import java.util.Arrays;

public class ArrayPracticeSort {

    public  void arrayListElements(){

        int[] numbers={1,22,56,78,20,45,90,22};
        int arraySize=numbers.length;

        int fifthElement=numbers[5-1];
        System.out.println("Array size is:"+arraySize);
        System.out.println("Fifth element is:"+fifthElement);

        for (int i=0; i<=numbers.length;i++){
            System.out.println("Array elements are::"+numbers[i]);
        }
    }


    public static void searchArray(int[] array,int searchElement){

        boolean found=false;
        for(int i=0; i< array.length-1 ;i++){
            int element=array[i];
            if(searchElement==element){
                found=true;
                System.out.println("Search element:"  +searchElement+  " and index is at :"+i);
            }
        }
        if (found == false){
            System.out.println("Search element:"+searchElement+ " not found in the array");
        }

    }

    public static void sortByInbuiltFunction(int[] array){
        System.out.println("Unsorted array is:"+ Arrays.toString(array));
        Arrays.sort(array); //ascending
        System.out.println("Arrays in ascending order:"+Arrays.toString(array));

        System.out.println("Arrays in descending order");
        for(int i=array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }

    public static void getOccurance(int[] array,int searchElement){
        int count=0;
        for(int i=0;i<=array.length-1;i++){
            int element=array[i];
            if(searchElement==element){
                count=count+1;
            }
        }
        System.out.println("The element " +searchElement+ " occured "+count+ " times in the array");
    }

    public static void main(String[] args) {
        /*ArrayPracticeSort a=new ArrayPracticeSort();
        a.arrayListElements();*/

        int[] num={1,66,90,43,3,7,8,9};
        searchArray(num,12);

        int[] Unsorted={11,45,3,7,8,9};
        sortByInbuiltFunction(Unsorted);

        int[] num1={11,90,87,10,90,11,78,34,26,90};
        getOccurance(num1,90);

    }
}

