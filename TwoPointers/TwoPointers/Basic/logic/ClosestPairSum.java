// 🧩 Problem: Find the index of the pair whose sum is closest to a target value
// 💡 Approach: Two pointers from both ends, minimize |sum - target|
// ⏱️ Time Complexity: O(n)
// 💾 Space Complexity: O(1)

public class ClosestPairSum {
    public static int[] findClosestPair(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int diff = Integer.MAX_VALUE;
        int[] result = {-1, -1};

        while (left < right) {
            int sum = arr[left] + arr[right];
            int currentDiff = Math.abs(sum - target);

            if (currentDiff < diff) {
                diff = currentDiff;
                result[0] = left;
                result[1] = right;
            }

            if (sum > target) right--;
            else left++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 10};
        int target = 15;
        int[] res = findClosestPair(arr, target);
        System.out.println("Closest pair indices: [" + res[0] + ", " + res[1] + "]");
    }
}
