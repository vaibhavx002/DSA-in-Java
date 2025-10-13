// 🧩 Problem: Find the minimum difference between any two elements in a sorted array
// 💡 Approach: Sort the array and find min diff between adjacent elements
// ⏱️ Time Complexity: O(n log n)
// 💾 Space Complexity: O(1)

import java.util.Arrays;

public class MinDifference {
    public static int findMinDiff(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 6, 8, 15, 1};
        System.out.println("Minimum difference: " + findMinDiff(arr));
    }
}
