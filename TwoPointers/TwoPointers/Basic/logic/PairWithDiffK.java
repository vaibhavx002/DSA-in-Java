// 🧩 Problem: Find first pair with a given difference K in a sorted array
// 💡 Approach: Use two pointers to find absolute difference
// ⏱️ Time Complexity: O(n)
// 💾 Space Complexity: O(1)

public class PairWithDiffK {
    public static boolean findPairWithDiff(int[] arr, int K) {
        int left = 0, right = 1;

        while (right < arr.length) {
            int diff = arr[right] - arr[left];

            if (left != right && diff == K) return true;
            else if (diff < K) right++;
            else left++;

            if (left == right) right++;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 12, 15};
        int K = 4;
        System.out.println("Pair with difference " + K + " exists: " + findPairWithDiff(arr, K));
    }
}
