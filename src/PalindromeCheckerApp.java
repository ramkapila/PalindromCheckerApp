import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("PalindromeCheckerApp - UC7");
        System.out.println("Version : 1.0");
        System.out.println("System initialised successfully");

        String input = "madam";

        // Using ArrayDeque as it's more efficient than LinkedList for Deque operations
        Deque<Character> deque = new ArrayDeque<>();

        // Step 1: Insert characters into the Deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Step 2: Compare front and rear elements
        // A palindrome must have matching ends until 0 or 1 character remains
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Display Result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        System.out.println("Program exited successfully.");
    }
}