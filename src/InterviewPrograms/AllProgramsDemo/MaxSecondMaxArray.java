package InterviewPrograms.AllProgramsDemo;

public class MaxSecondMaxArray {
    public static void main(String[] args) {
        int[] num = {20, 89, 67, 12, 6, 34};
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int num1 : num) {
            if (num1 > max) {
                secondmax = max;
                max = num1;
            } else if (num1 > secondmax && num1 != max) {
                secondmax = num1;
            }
        }
        System.out.println("The maximum number is: " + max);
        System.out.println("The second maximun number is: " + secondmax);
    }
}
