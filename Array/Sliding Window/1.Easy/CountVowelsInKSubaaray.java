public class CountVowelsInKSubaaray {
    public static void countVowels(int arr[] , int k ){
        if (arr.length == 0 || k <= 0 || k > arr.length){
            System.out.println(0);
            return;
        }
        int n = arr.length;
        int count = 0;
        for (int i = 0 ; i < k ; i++){
            char c = (char)arr[i];
            if (isVowel(c)){
                count++;
            }
        }
        System.out.println("Count of vowels in first window: " + count);
        int count1 = count;
        for (int i = k ; i < n ; i++){
            if (isVowel((char)arr[i-k])){
                count1--;
            }
            if (isVowel((char)arr[i])){
                count1++;
            }
            System.out.println(count1);
        }
    }
    public static boolean isVowel(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {'a','b','c','i','e','o','u','x'};
        int k = 3;
        countVowels(arr,k);
    }
}
