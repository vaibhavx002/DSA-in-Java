// Problem: Find the intersection of two sorted arrays (unique elements)
// Approach: Merge-style two-pointer traversal
// Time Complexity: O(n + m)
// Space Complexity: O(1)

import java.util.*;

public class IntersectionSorted {

    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        List<Integer> intersection = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                // Avoid duplicates in the result
                if (intersection.isEmpty() || intersection.get(intersection.size() - 1) != arr1[i]) {
                    intersection.add(arr1[i]);
                }
                i++;
                j++;
            } 
            else if (arr1[i] < arr2[j]) {
                i++;
            } 
            else {
                j++;
            }
        }

        return intersection;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 2, 3, 5, 7};

        List<Integer> result = findIntersection(arr1, arr2);

        System.out.println("Intersection of two sorted arrays:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
