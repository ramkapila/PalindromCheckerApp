public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("PalindromeCheckerApp - UC10");
        System.out.println("Version : 1.0");
        System.out.println("System initialised successfully");

        // Input with spaces and mixed casing
        String input = "A man a plan a canal Panama";

        // Step 1: Normalize the string
        // .toLowerCase() handles the case sensitivity
        // .replaceAll("[^a-zA-Z0-9]", "") removes all non-alphanumeric characters (spaces, commas, etc.)
        String cleanString = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("Original: " + input);
        System.out.println("Normalized: " + cleanString);

        // Step 2: Use Two-Pointer logic for validation
        boolean isPalindrome = true;
        int left = 0;
        int right = cleanString.length() - 1;

        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Step 3: Display Result
        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome (Case & Space Ignored).");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

        System.out.println("Program exited successfully.");
    }
}
