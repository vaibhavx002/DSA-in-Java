public class SumDivisbleByK {
    public static void sumCount(int arr[] , int k ){
        if (arr.length == 0 || k <= 0 ){
            System.out.println(0);
            return;
        }
        int n = arr.length;
        int count = 0 ;
        for (int i = 0 ; i < n ; i++){
            int sum = 0 ;
            for (int j = i ; j < n ; j++){
                sum += arr[j];
                if (sum % k == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        int arr[] = {4,5,0,-2,-3,1};
        int k = 5;
        sumCount(arr,k);
    }
}
