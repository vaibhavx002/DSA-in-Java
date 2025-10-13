// 🧩 Problem: Find maximum and minimum in an array using the tournament method
// 💡 Approach: Compare elements in pairs to minimize total comparisons
// ⏱️ Time Complexity: O(n)
// 💾 Space Complexity: O(1)
// 🧠 Concept: Instead of comparing every element twice, compare in pairs — reducing total comparisons by ~50%

public class MaxMinTournament {

    static class Pair {
        int min;
        int max;
    }

    public static Pair findMinMax(int[] arr) {
        Pair result = new Pair();
        int i;
        int n = arr.length;

        // If even number of elements
        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                result.max = arr[0];
                result.min = arr[1];
            } else {
                result.max = arr[1];
                result.min = arr[0];
            }
            i = 2;
        }
        // If odd number of elements
        else {
            result.max = arr[0];
            result.min = arr[0];
            i = 1;
        }

        // Compare in pairs
        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                result.max = Math.max(result.max, arr[i]);
                result.min = Math.min(result.min, arr[i + 1]);
            } else {
                result.max = Math.max(result.max, arr[i + 1]);
                result.min = Math.min(result.min, arr[i]);
            }
            i += 2;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {100, 11, 445, 1, 330, 3000};
        Pair ans = findMinMax(arr);
        System.out.println("Minimum element: " + ans.min);
        System.out.println("Maximum element: " + ans.max);
    }
}
