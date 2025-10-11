/**
 * 🔹 Problem: Reverse an array in-place
 *
 * Reverse the elements of an array without using extra space.
 *
 * 🧩 Pattern Used: Two Pointer (Start–End)
 * 🕒 Time Complexity: O(n)
 * 💾 Space Complexity: O(1)
 *
 * Example:
 * Input: [1, 2, 3, 4, 5]
 * Output: [5, 4, 3, 2, 1]
 */

public class ReverseArray {

    // Function to reverse array in place
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // Utility to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Driver code for testing
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        printArray(arr);

        reverse(arr);

        System.out.println("Reversed Array:");
        printArray(arr);
    }
}
