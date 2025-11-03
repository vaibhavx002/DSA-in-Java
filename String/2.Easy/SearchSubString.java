// LeetCode - 28. Find the Index of the First Occurrence in a String
// In this we have to find the First Index of the String str where substr is found
// If substr is not found then we have to return -1
public class SearchSubString {
    public static int searchIndex(String str, String substr){
        if (str == null || substr == null || substr.length()>str.length()){
            return -1;
        }
        int n = str.length();
        int m = substr.length();
        for (int i = 0 ; i <= n-m ; i++){  
            // Here we use n-m because to avoid Index out of Range Error and <= because the last element m-1 can be the index of the substr
            if (str.substring(i,i+m).equals(substr)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "hello";
        String substr = "ll";
        System.out.println(searchIndex(str, substr));
    }
}
