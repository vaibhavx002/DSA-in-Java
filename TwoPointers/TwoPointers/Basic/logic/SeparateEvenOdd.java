// 🧩 Problem: Separate even and odd numbers in-place
// 💡 Approach: Two pointers swapping even-left, odd-right
// ⏱️ Time Complexity: O(n)
// 💾 Space Complexity: O(1)

import java.util.Arrays;

public class SeparateEvenOdd {
    public static void segregateEvenOdd(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) left++;
            while (arr[right] % 2 == 1 && left < right) right--;

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};
        segregateEvenOdd(arr);
        System.out.println("Array after segregation: " + Arrays.toString(arr));
    }
}
