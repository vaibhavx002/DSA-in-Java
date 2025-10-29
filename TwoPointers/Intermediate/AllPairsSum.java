// Problem: Find all pairs in a sorted array whose sum equals K
// Approach: Two-pointer technique
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

public class AllPairsSum {

    public static List<int[]> findAllPairs(int[] nums, int k) {
        Arrays.sort(nums); // Ensure array is sorted
        int left = 0, right = nums.length - 1;
        List<int[]> result = new ArrayList<>();

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                result.add(new int[]{nums[left], nums[right]});
                int leftVal = nums[left];
                int rightVal = nums[right];

                // Skip duplicates to ensure unique pairs
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
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 5, 6, 6, 7};
        int k = 7;

        List<int[]> pairs = findAllPairs(nums, k);
        System.out.println("All unique pairs with sum = " + k + ":");
        for (int[] pair : pairs) {
            System.out.println(pair[0] + " + " + pair[1]);
        }
    }
}
