// 🧩 Problem: Find if a pair with given sum K exists in a sorted array
// 💡 Approach: Use two pointers (left & right) and move them based on sum comparison
// ⏱️ Time Complexity: O(n)
// 💾 Space Complexity: O(1)

public class PairSum {
    public static boolean hasPairWithSum(int[] arr, int K) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == K) return true;
            else if (sum < K) left++;
            else right--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 11, 15};
        int K = 15;
        System.out.println("Pair with sum " + K + " exists: " + hasPairWithSum(arr, K));
    }
}
