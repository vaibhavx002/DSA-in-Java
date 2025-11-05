public class AverageofSubarray {
    public static double subarrayAverage(int arr[] ,int k ){
        if (arr.length == 0 || k <= 0 || k > arr.length){
            return -1;
        }
        int n = arr.length;
        int sum = 0 ;
        double avg = 0 ;
        for (int i = 0 ; i < k ; i++){
            sum += arr[i];
            avg = (double)sum/k;
        }
        double max = avg;
        int sum1 = sum;
        double avg1 = 0 ;
        for (int j = k ; j < n ; j++){
            sum1 = sum1 - arr[j-k] + arr[j];
            avg1 = (double)sum1/k;
            max = Math.max(max,avg1);
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {1,2,4,4,5};
        int k = 3;
        System.out.printf("%.2f",subarrayAverage(arr,k));
    }
}
