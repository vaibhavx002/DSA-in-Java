public class LongestPalindromeSubString {
    public static void longestSubstring(String str){
        if (str == null || str.length() == 0){
            System.out.println(0);
            return;
        }
        int n = str.length();
        int maxLen = 0 ;
        for (int i = 0 ; i < n ; i++){
            for (int j = i+1 ; j < n ; j++){
                if (str.charAt(i) == str.charAt(j)){
                    boolean isCheck = check(str,i,j);
                    if (isCheck){
                        int len = j-i+1;
                        if (len > maxLen){
                            maxLen = len;
                            
                        }
                    }
                }
            }
        }
        System.out.println(maxLen);
    }
    public static boolean check(String subStr , int start , int end){
        int n = subStr.length();
        while (start<end){
            if (subStr.charAt(start) != subStr.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String args[]){
        String str = "forgeeksskeegfor";
        longestSubstring(str);
    }
}
