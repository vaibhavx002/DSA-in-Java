public class SmallestSubarray {
    public static int smallestSubarray(int arr[] , int target ){
        if (arr.length == 0 || target <= 0 ){
            return -1;
        }
        int windowSum = 0 ;
        int start = 0 ;
        int end = 0;
        int minLength = Integer.MAX_VALUE;
        while (end < arr.length){
            windowSum += arr[end];
            while (windowSum >= target){
                windowSum -= arr[start];
                minLength = Math.min(minLength,end-start+1);
                start++;
            }
           
            end++;
        }
        return minLength;
    }
    public static void main(String args[]){
        int arr[] = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(smallestSubarray(arr,target));
    }
}
