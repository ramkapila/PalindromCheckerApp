public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("PalindromeCheckerApp");
        System.out.println("Version : 1.0");
        System.out.println("System initialised successfully");

        // Input String
        String original = "madam";
        String reversed = "";

        // UC3 Flow: Reverse string using a for-loop
        // We start from the last index (length - 1) and move to 0
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i); // String Concatenation
        }

        // Compare original and reversed using .equals()
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        System.out.println("Program exited successfully.");
        }
    }

