package InterviewPrograms.AllProgramsDemo;

//A String Compressor in Java is a program that shortens a string by replacing repeated characters with:
// the character + the number of times it repeats.
//To save space.
//To make a string smaller and easier to work with.
//It's like shrinking a long message if it has many repeating letters.


//Write a java program string compressor
public class CompressPRgm {
    public static String compress(String input) {
        String result = "";
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++; // Count how many times the same letter appears
            } else {
                result += input.charAt(i - 1) + String.valueOf(count); // Add letter + count
                count = 1; // Reset for next letter
            }
        }

        // Add the last letter and its count
        result += input.charAt(input.length() - 1) + String.valueOf(count);

        return result;
    }

    public static void main(String[] args) {
        String input = "aaabbbbssss";
        String output = compress(input);

        System.out.println("Original data: " + input);
        System.out.println("Compressed data: " + output);
    }
}

