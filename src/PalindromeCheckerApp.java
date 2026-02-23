
class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("PalindromeCheckerApp - UC8");
        System.out.println("Version : 1.0");
        System.out.println("System initialised successfully");

        String input = "madam";
        if (input.length() == 0) return;

        // Step 1: Convert String to Singly Linked List
        Node head = new Node(input.charAt(0));
        Node temp = head;
        for (int i = 1; i < input.length(); i++) {
            temp.next = new Node(input.charAt(i));
            temp = temp.next;
        }

        // Step 2: Find the middle using Fast and Slow Pointers
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 3: Reverse the second half of the list
        Node secondHalf = reverseList(slow);
        Node firstHalf = head;
        Node secondHalfCopy = secondHalf; // To keep track for result

        // Step 4: Compare halves
        boolean isPalindrome = true;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Step 5: Display Result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
        System.out.println("Program exited successfully.");
    }

    // Helper method to reverse a Linked List
    public static Node reverseList(Node head) {
        Node prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}