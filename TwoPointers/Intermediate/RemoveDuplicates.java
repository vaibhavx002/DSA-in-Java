// Problem: Remove duplicates from a sorted array in-place
// Approach: Two-pointer technique
// Time Complexity: O(n), Space Complexity: O(1)

// Explanation:

// Since the array is sorted, duplicates are always adjacent.

// Use:

// i → to track the position of last unique element.

// j → to find the next different element.

// Whenever nums[j] != nums[i], move i one step ahead and copy nums[j].


import java.util.*;

public class RemoveDuplicates {

    // Function to remove duplicates and return new length
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // slow pointer
        for (int j = 1; j < nums.length; j++) { // fast pointer
            if (nums[j] != nums[i]) { 
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; // length of unique elements
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 3, 4, 5};
        int newLength = removeDuplicates(nums);

        System.out.println("Unique elements count: " + newLength);
        System.out.print("Modified Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

