// Problem: Count pairs in a sorted array with absolute difference = K
// Approach: Two-pointer traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

public class PairsWithDiffK {

    public static int countPairsWithDiff(int[] nums, int k) {
        Arrays.sort(nums); // Ensure sorted
        int left = 0, right = 1;
        int count = 0;
        int n = nums.length;

        while (right < n) {
            int diff = nums[right] - nums[left];

            if (diff == k && left != right) {
                count++;
                int leftVal = nums[left];
                int rightVal = nums[right];

                // Skip duplicates
                while (left < n && nums[left] == leftVal) left++;
                while (right < n && nums[right] == rightVal) right++;
            } 
            else if (diff < k) {
                right++;
            } 
            else {
                left++;
                if (left == right) right++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 4, 2, 5};
        int k = 2;

        int result = countPairsWithDiff(nums, k);
        System.out.println("Count of unique pairs with difference = " + k + ": " + result);
    }
}
