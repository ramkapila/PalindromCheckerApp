import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("PalindromeCheckerApp - UC6");
        System.out.println("Version : 1.0");
        System.out.println("System initialised successfully");

        String input = "madam";

        // Stack for LIFO (Reverse Order)
        Stack<Character> stack = new Stack<>();
        // Queue for FIFO (Original Order) - LinkedList implements the Queue interface
        Queue<Character> queue = new LinkedList<>();

        // Step 1: Add characters to both data structures
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);   // LIFO
            queue.add(ch);    // FIFO
        }

        boolean isPalindrome = true;

        // Step 2: Compare Dequeue (Original) vs Pop (Reverse)
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
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