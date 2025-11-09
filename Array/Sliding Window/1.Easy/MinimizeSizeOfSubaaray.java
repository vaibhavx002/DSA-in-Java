public class MinimizeSizeOfSubaaray {
    public static int minimumLength(int arr[] , int target){
        if (arr.length == 0 || target <= 0 ){
            return 0;
        }
        int n = arr.length;
        int start = 0 ;
        int end = 0 ;
        int minLENGTH = Integer.MAX_VALUE ;
        int sum = 0 ;
        while (end < n ){
            sum += arr[end];
            while (sum >= target ){
                minLENGTH = Math.min(minLENGTH, end-start+1);
                sum = sum - arr[start];
                start++;
            }
            end ++;
        }
        return minLENGTH;
    }
    public static void main(String rags[]){
        int arr[] = {1,2,3,4,5};
        int target = 9;
        System.out.println(minimumLength(arr,target));
    }
}
