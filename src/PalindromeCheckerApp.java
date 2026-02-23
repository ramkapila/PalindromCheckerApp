
class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("PalindromeCheckerApp - UC9");
        System.out.println("Version : 1.0");
        System.out.println("System initialised successfully");

        String input = "madam";

        // Step 1: Call the recursive function
        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        // Step 2: Display Result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        System.out.println("Program exited successfully.");
    }

    /**
     * Recursive method to check palindrome
     * @param str The string to check
     * @param low Starting index
     * @param high Ending index
     * @return true if palindrome, false otherwise
     */
    public static boolean checkPalindrome(String str, int low, int high) {
        // Base Case 1: If pointers cross or meet, it's a palindrome
        if (low >= high) {
            return true;
        }

        // Base Case 2: If characters at pointers don't match, it's NOT a palindrome
        if (str.charAt(low) != str.charAt(high)) {
            return false;
        }

        // Recursive Step: Check the inner substring
        return checkPalindrome(str, low + 1, high - 1);
    }
}
