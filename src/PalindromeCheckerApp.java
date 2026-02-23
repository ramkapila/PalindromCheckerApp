public class PalindromeCheckerApp {

        public static void main(String[] args) {
            public static void main(String[] args) {
                System.out.println("PalindromeCheckerApp - UC4");
                System.out.println("Version : 1.0");
                System.out.println("System initialised successfully");

                String input = "madam";

                // Step 1: Convert String to Character Array
                char[] charArray = input.toCharArray();

                // Step 2: Initialize Two Pointers
                int left = 0;
                int right = charArray.length - 1;
                boolean isPalindrome = true;

                // Step 3: Compare characters using Two-Pointer Approach
                while (left < right) {
                    if (charArray[left] != charArray[right]) {
                        isPalindrome = false;
                        break; // Exit early if a mismatch is found
                    }
                    left++;  // Move front pointer forward
                    right--; // Move back pointer backward
                }

                // Step 4: Display Result
                if (isPalindrome) {
                    System.out.println(input + " is a Palindrome.");
                } else {
                    System.out.println(input + " is NOT a Palindrome.");
                }

                System.out.println("Program exited successfully.");
        }
    }

