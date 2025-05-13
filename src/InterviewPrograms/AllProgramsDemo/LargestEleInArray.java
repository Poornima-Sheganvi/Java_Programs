package InterviewPrograms.AllProgramsDemo;

public class LargestEleInArray {
    public static void main(String[] args) {
        int[] num = {100,10, 267,20, 45, 3, 9, 77,345, 90};
        int max = num[0]; //start with first element
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Largest element is: " + max);
    }
}
