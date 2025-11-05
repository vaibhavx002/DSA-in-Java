public class CountSubarrayWithSum {
    public static int countSubarraywithSum(int arr[] , int k , int target ){
        if(arr.length == 0 || k <= 0 || k > arr.length){
            return -1;
        }
        int count = 0;
        int sum = 0;
        for (int i = 0 ; i < k ; i++){
            sum += arr[i];
        }
        if (sum >= target){
            count++;
        }
        int sum1 = sum;
        for (int i = k ; i < arr.length ; i++){
            sum1 = sum1 - arr[i-k] + arr[i];
            if (sum1 >= target){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] = {2, 1, 3, 2, 4, 1};
        int k = 3;
        int target = 6;
        System.out.println(countSubarraywithSum(arr,k,target));
    }
}
