// 🧩 Problem: Find the second largest element in an array
// 💡 Approach: Track max and second max during single pass
// ⏱️ Time Complexity: O(n)
// 💾 Space Complexity: O(1)

public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Second largest element: " + findSecondLargest(arr));
    }
}
