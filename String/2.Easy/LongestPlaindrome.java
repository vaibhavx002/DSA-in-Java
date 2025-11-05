public class LongestPlaindrome{
    public static int longestPlaindrome(String str){
        int countOdd = 0;
        int countEven = 0;
        int len = 0 ;
        if ( str == null || str.length() == 1){
            return 1;
        }
        for(int i = 0 ; i < str.length() ; i++){
            int count = 0 ;
            boolean isCheck = false;
            for (int k = 0 ; k < i ; k++){
                if (str.charAt(i) == str.charAt(k)){
                    isCheck = true;
                    break;
                }
            }
            if (isCheck){
                continue;
            }
            else {
                for (int j = 0 ; j < str.length() ; j++){
                    if (str.charAt(i) == str.charAt(j)){
                        count++;
                    }
                }
            }
            if (count % 2 == 0 ){
                countEven += count;
            }
            else if(count % 2 != 0){
                countOdd += count;
            }
        }
        if (countOdd > 0 ){
            len = countEven + 1; 
        }
        else {
            len = countEven ;
        }
        return len;
    }
    public static void main(String args[]){
        String str = "abccccdd";
        System.out.println(longestPlaindrome(str));
    }
}