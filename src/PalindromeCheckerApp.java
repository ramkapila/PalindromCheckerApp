import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    // --- UC12: Strategy Pattern Components ---

    // 1. Strategy Interface (Static allows access within the static Main)
    public interface PalindromeStrategy {
        boolean isValid(String text);
    }

    // 2. Stack Strategy implementation
    public static class StackStrategy implements PalindromeStrategy {
        @Override
        public boolean isValid(String text) {
            String cleaned = text.toLowerCase().replaceAll("[^a-z0-9]", "");
            Stack<Character> stack = new Stack<>();
            for (char c : cleaned.toCharArray()) {
                stack.push(c);
            }
            StringBuilder reversed = new StringBuilder();
            while (!stack.isEmpty()) {
                reversed.append(stack.pop());
            }
            return cleaned.equals(reversed.toString());
        }
    }

    // 3. Deque Strategy implementation
    public static class DequeStrategy implements PalindromeStrategy {
        @Override
        public boolean isValid(String text) {
            String cleaned = text.toLowerCase().replaceAll("[^a-z0-9]", "");
            Deque<Character> deque = new ArrayDeque<>();
            for (char c : cleaned.toCharArray()) {
                deque.addLast(c);
            }
            while (deque.size() > 1) {
                if (!deque.removeFirst().equals(deque.removeLast())) {
                    return false;
                }
            }
            return true;
        }
    }

    // 4. Context Class
    public static class PalindromeService {
        private PalindromeStrategy strategy;

        public void setStrategy(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean check(String text) {
            if (strategy == null) return false;
            return strategy.isValid(text);
        }
    }

    // --- MAIN METHOD ---
    public static void main(String[] args) {
        System.out.println("PalindromeCheckerApp");
        System.out.println("Version : 1.2 (Strategy Pattern)");
        System.out.println("System initialised successfully");
        System.out.println("-----------------------------------");

        String word = "madam";
        PalindromeService service = new PalindromeService();

        // Testing Stack Strategy
        service.setStrategy(new StackStrategy());
        System.out.println("[Stack]  Is '" + word + "' a palindrome? " + service.check(word));

        // Testing Deque Strategy
        service.setStrategy(new DequeStrategy());
        System.out.println("[Deque]  Is '" + word + "' a palindrome? " + service.check(word));

        System.out.println("-----------------------------------");
        System.out.println("Program exited successfully.");
    }
}
