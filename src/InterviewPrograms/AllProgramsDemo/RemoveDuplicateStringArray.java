package InterviewPrograms.AllProgramsDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateStringArray {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "orange", "apple", "banana", "mango"};

        Set<String> set1 = new HashSet<>(Arrays.asList(arr));

        String[] result = set1.toArray(new String[0]);
        System.out.println("Original values: " + Arrays.toString(arr));
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}
