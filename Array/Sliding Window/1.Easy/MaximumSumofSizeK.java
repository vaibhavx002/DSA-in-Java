// In this we will find the maximum sum of Subarray of FIXED - LENGTH .
public class MaximumSumofSizeK {
    public static int maximumSum(int arr[] , int k ){
        if (arr.length == 0 || k <= 0 || k > arr.length){
            return -1;
        }
        int sum = 0 ;
        // Here we are finding the sum of first Window Size having 3 Elements .
        // AS k = 3 so it contains the element sum at index {0,1,2}
        for (int i = 0 ; i < k ; i++){
            sum += arr[i];
        }
        int n = arr.length;
        int maxSum = sum;
        int sum1 = sum;
        for (int j = k ; j < n ; j++){
            sum1 = sum1 - arr[j-k] + arr[j];
            // Here arr[j-k] is the element which is going to be out of the window .
            // We are subtracting it from the sum .
            // And then we are adding the new element which is coming into the window .
            maxSum = Math.max(maxSum,sum1);
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        System.out.println(maximumSum(arr,k));
    }
}
