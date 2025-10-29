// Problem: Count number of unique pairs with sum = K
// Approach: Two-pointer technique on sorted array (avoid duplicates)
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

public class CountUniquePairs {

    public static int countUniquePairs(int[] nums, int k) {
        Arrays.sort(nums); // Ensure array is sorted
        int left = 0, right = nums.length - 1;
        int count = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                count++;
                int leftVal = nums[left];
                int rightVal = nums[right];

                // Skip duplicates on both sides
                while (left < right && nums[left] == leftVal) left++;
                while (left < right && nums[right] == rightVal) right--;
            } 
            else if (sum < k) {
                left++;
            } 
            else {
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 5, 6};
        int k = 7;

        int result = countUniquePairs(nums, k);
        System.out.println("Unique pairs with sum = " + k + ": " + result);
    }
}
