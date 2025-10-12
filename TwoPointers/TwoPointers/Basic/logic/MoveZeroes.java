// 🧩 Problem: Move all zeroes to the end of the array while maintaining order
// 💡 Approach: Use a pointer to track non-zero elements and swap
// ⏱️ Time Complexity: O(n)
// 💾 Space Complexity: O(1)

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] arr) {
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos++] = arr[i];
            }
        }

        while (pos < arr.length) {
            arr[pos++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println("After moving zeroes: " + Arrays.toString(arr));
    }
}
