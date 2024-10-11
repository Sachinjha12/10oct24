package pack1;

import java.util.HashSet;
import java.util.Scanner;

public class StringOperation_Q9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Display the operation options
        System.out.println("Following are the operations:");
        System.out.println("Write 1, 2, 3, or 4 in terminal:");
        System.out.println("1 -> Add the string to itself");
        System.out.println("2 -> Replace odd positions with #");
        System.out.println("3 -> Remove duplicate characters in the string");
        System.out.println("4 -> Change odd characters to upper case");

        // Take user input for operation choice
        int choice = sc.nextInt();
        String result = Operations(str, choice);

        // Output the result of the operation
        System.out.println("Result: " + result);
    }

    // Method to perform the string operations
    private static String Operations(String input, int choice) {
        switch (choice) {
            case 1: 
                return input + " " + input;  // Add string to itself
            case 2: 
                return replaceOdd(input);    // Replace odd positions with #
            case 3: 
                return removeDup(input);     // Remove duplicate characters
            case 4: 
                return changeOTC(input);     
            default: 
                return "Invalid choice";     // Invalid choice handling
        }
    }

    // Method to replace odd positions with #
    private static String replaceOdd(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(i % 2 != 0 ? '#' : str.charAt(i));  // Replace odd index with #
        }
        return sb.toString();
    }

    // Method to remove duplicate characters
    private static String removeDup(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> charSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (charSet.add(c)) {  // Only add unique characters
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static String changeOTC(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(i % 2 != 0 ? Character.toUpperCase(str.charAt(i)) : str.charAt(i));  // Uppercase for odd index
        }
        return sb.toString();
    }
}
