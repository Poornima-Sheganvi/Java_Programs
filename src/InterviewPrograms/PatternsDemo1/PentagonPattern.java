package InterviewPrograms.PatternsDemo1;

public class PentagonPattern {
    public static void main(String[] args) {
        int n = 5; // Size of the pattern (can be adjusted)

        // Upper triangle part
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("* ");
            System.out.println();
        }

        // Bottom trapezoid part
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            for (int j = 1; j <= (2 * n - 1); j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    }

