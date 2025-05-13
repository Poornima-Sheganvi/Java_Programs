package InterviewPrograms.Patterns;

public class CirclePattern {
    public static void main(String[] args) {
        int radius = 5; // You can change this value for a bigger/smaller circle

        for (int y = -radius; y <= radius; y++) {
            for (int x = -radius; x <= radius; x++) {
                double distance = Math.sqrt(x * x + y * y);
                if (distance > radius - 0.5 && distance < radius + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next line
        }
    }
}
