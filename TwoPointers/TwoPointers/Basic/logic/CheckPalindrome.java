/**
 * 🔹 Problem: Check if an array is a palindrome
 *
 * Given an integer array, determine whether it reads the same forward and backward.
 *
 * 🧩 Pattern Used: Two Pointer (Start–End)
 * 🕒 Time Complexity: O(n)
 * 💾 Space Complexity: O(1)
 *
 * Example:
 * Input: [1, 2, 3, 2, 1]
 * Output: true
 */

public class CheckPalindrome {

    // Function to check if an array is palindrome
    public static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Driver code for testing
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println("Array 1 Palindrome? " + isPalindrome(arr1)); // ✅ true
        System.out.println("Array 2 Palindrome? " + isPalindrome(arr2)); // ❌ false
    }
}
