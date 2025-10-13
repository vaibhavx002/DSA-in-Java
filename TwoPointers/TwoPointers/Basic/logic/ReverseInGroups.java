// 🧩 Problem: Reverse the array in groups of size K
// 💡 Approach: Use start/end pointers for each block of size K
// ⏱️ Time Complexity: O(n)
// 💾 Space Complexity: O(1)

import java.util.Arrays;

public class ReverseInGroups {
    public static void reverseInGroups(int[] arr, int k) {
        for (int i = 0; i < arr.length; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        reverseInGroups(arr, k);
        System.out.println("Array after reversing in groups: " + Arrays.toString(arr));
    }
}
