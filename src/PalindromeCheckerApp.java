import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase13PalindromeCheckerApp {

    // --- UC12/13: Strategy Pattern Components ---

    public interface PalindromeStrategy {
        boolean isValid(String text);
    }

    // Implementation 1: Stack (LIFO)
    public static class StackStrategy implements PalindromeStrategy {
        @Override
        public boolean isValid(String text) {
            String cleaned = text.toLowerCase();
            Stack<Character> stack = new Stack<>();
            for (char c : cleaned.toCharArray()) stack.push(c);
            StringBuilder reversed = new StringBuilder();
            while (!stack.isEmpty()) reversed.append(stack.pop());
            return cleaned.equals(reversed.toString());
        }
    }

    // Implementation 2: Deque (Double-Ended)
    public static class DequeStrategy implements PalindromeStrategy {
        @Override
        public boolean isValid(String text) {
            String cleaned = text.toLowerCase();
            Deque<Character> deque = new ArrayDeque<>();
            for (char c : cleaned.toCharArray()) deque.addLast(c);
            while (deque.size() > 1) {
                if (!deque.removeFirst().equals(deque.removeLast())) return false;
            }
            return true;
        }

    // --- MAIN METHOD ---
    public static void main(String[] args) {
        System.out.println("PalindromeCheckerApp");
        System.out.println("Version : 1.3 (Performance Comparison)");
        System.out.println("System initialised successfully");
        System.out.println("-----------------------------------");

        String word = "madamimadam"; // A longer palindrome for better measurement

        // Define strategies
        PalindromeStrategy stackAlgo = new StackStrategy();
        PalindromeStrategy dequeAlgo = new DequeStrategy();

        // 1. Measure Stack Strategy
        long startTimeStack = System.nanoTime();
        boolean isStackPalindrome = stackAlgo.isValid(word);
        long endTimeStack = System.nanoTime();
        long durationStack = endTimeStack - startTimeStack;

        // 2. Measure Deque Strategy
        long startTimeDeque = System.nanoTime();
        boolean isDequePalindrome = dequeAlgo.isValid(word);
        long endTimeDeque = System.nanoTime();
        long durationDeque = endTimeDeque - startTimeDeque;

        // --- Display Results ---
        System.out.println("Algorithm Comparison for: " + word);
        System.out.println("1. Stack Strategy: " + durationStack + " ns | Result: " + isStackPalindrome);
        System.out.println("2. Deque Strategy: " + durationDeque + " ns | Result: " + isDequePalindrome);
        System.out.println("-----------------------------------");

        if (durationStack < durationDeque) {
            System.out.println("Winner: Stack Strategy (faster for this instance)");
        } else {
            System.out.println("Winner: Deque Strategy (faster for this instance)");
        }

        System.out.println("Program exited successfully.");
    }
}
