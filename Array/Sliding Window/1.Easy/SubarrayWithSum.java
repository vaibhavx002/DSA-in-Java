// In this we find a Subarray with the sum equal to the given sum only positive integer are their.
public class SubarrayWithSum {
    public static boolean subarrayWithSum(int arr[] , int target){
        if (arr.length == 0 || target <= 0 ){
            return false;
        }
        int n = arr.length;
        int start = 0;
        int end = 0;
        int sum = 0;
        while (end < n ){
            sum += arr[end];
            while (sum > target){
                sum -= arr[start];
                start++;
            }
            if (sum == target){
                return true;
            }
            end++;
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int target = 9;
        System.out.println(subarrayWithSum(arr,target));
    }
    
}
