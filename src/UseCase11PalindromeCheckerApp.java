import java.util.Stack;
import java.util.Scanner;

public class UseCase11PalindromeCheckerApp {

    // UC11: Encapsulated Logic inside a static method of the Main Class
    public static boolean checkPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Clean the input: lowercase and remove non-alphanumeric characters
        String cleanedInput = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Data Structure: Stack (LIFO - Last In, First Out)
        Stack<Character> charStack = new Stack<>();

        // Step 1: Push all characters of the string onto the stack
        for (char c : cleanedInput.toCharArray()) {
            charStack.push(c);
        }

        // Step 2: Pop characters and build the reversed string
        StringBuilder reversedWord = new StringBuilder();
        while (!charStack.isEmpty()) {
            reversedWord.append(charStack.pop());
        }

        // Step 3: Compare original cleaned string with reversed version
        return cleanedInput.equals(reversedWord.toString());
    }

    public static void main(String[] args) {
        System.out.println("PalindromeCheckerApp");
        System.out.println("Version : 1.1");
        System.out.println("System initialised successfully");
        System.out.println("-----------------------------------");

        // Hardcoded string as per your initial requirement
        String word = "madam";

        // Logic execution using the encapsulated method
        if (checkPalindrome(word)) {
            System.out.println("Result: '" + word + "' is a Palindrome.");
        } else {
            System.out.println("Result: '" + word + "' is NOT a Palindrome.");
        }

        System.out.println("-----------------------------------");
        System.out.println("Program exited successfully.");
    }
}