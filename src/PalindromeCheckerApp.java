public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("PalindromeCheckerApp - UC5");
        System.out.println("Version : 1.0");
        System.out.println("System initialised successfully");

        String input = "madam";
        Stack<Character> stack = new Stack<>();

        // Step 1: Push all characters of the string onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Step 2: Pop characters and build the reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Step 3: Compare and Display Result
        if (input.equals(reversed)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        System.out.println("Program exited successfully.");
        }
    }

