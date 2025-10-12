// 🧩 Problem: Move all negative numbers to the beginning of the array
// 💡 Approach: Use two pointers — swap negatives towards the start
// ⏱️ Time Complexity: O(n)
// 💾 Space Complexity: O(1)

import java.util.Arrays;

public class MoveNegatives {
    public static void moveNegatives(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            if (arr[left] < 0) left++;
            else if (arr[right] >= 0) right--;
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -1, 5, -6};
        moveNegatives(arr);
        System.out.println("After moving negatives: " + Arrays.toString(arr));
    }
}
