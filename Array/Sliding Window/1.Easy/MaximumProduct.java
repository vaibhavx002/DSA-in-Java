public class MaximumProduct {
    public static int maximumProduct(int arr[], int k) {
        if (arr.length == 0 || k <= 0 || k > arr.length) {
            return 0;
        }

        int n = arr.length;
        int currentProduct = 1;
        int maxProduct = Integer.MIN_VALUE;
        int zeroCount = 0;

        // Compute product for first window
        for (int i = 0; i < k; i++) {
            if (arr[i] == 0) zeroCount++;
            else currentProduct *= arr[i];
        }

        // If first window has no zero, consider it
        if (zeroCount == 0) {
            maxProduct = Math.max(maxProduct, currentProduct);
        } else {
            maxProduct = Math.max(maxProduct, 0);
        }

        // Slide the window
        for (int j = k; j < n; j++) {
            int out = arr[j - k];  // element going out
            int in = arr[j];       // element coming in

            // Remove outgoing element
            if (out == 0) {
                zeroCount--;
            } else {
                currentProduct /= out;
            }

            // Add new element
            if (in == 0) {
                zeroCount++;
            } else {
                currentProduct *= in;
            }

            // Only consider if there are no zeros in current window
            if (zeroCount == 0) {
                maxProduct = Math.max(maxProduct, currentProduct);
            } else {
                maxProduct = Math.max(maxProduct, 0);  // product becomes 0 if window contains zero
            }
        }

        return maxProduct;
    }

    public static void main(String args[]) {
        int arr[] = {1, 5, 0, 2, 3, 7, 0, 4};
        int k = 3;
        System.out.println(maximumProduct(arr, k)); // Output: 42 (from [2,3,7])
    }
}
