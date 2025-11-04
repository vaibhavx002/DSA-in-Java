// LeetCode - 205. Isomorphic Strings in this we have to count the frequency of each character in the string

import java.util.HashMap;

public class IsomorphicString {
    // First Solve Using BRUTE APPROACH - T.C -> O(N^2) & S.C -> O(1)
    public static boolean checkIsomorphic(String str1 , String str2){
        int n = str1.length();
        int m = str2.length();
        if (n != m){
            return false;
        }
        // We will return false when the two string length is not equal
        for (int i = 0 ; i < str1.length() ; i++){
            int countFirst = 0 ;
            int countSecond = 0;
            // We will count the frequency of each character in the str1 and str2
            // Here we will check the frequency of each character in the str1
            for (int j = 0 ; j < str1.length() ; j++){
                if (str1.charAt(i) == str1.charAt(j)){
                    countFirst++;
                }
            } 
            //Here we will check the frequency of each character in the str2
            for (int k = 0 ; k < str2.length() ; k++){
                if (str2.charAt(k) == str2.charAt(i)){
                    countSecond++;
                }
            }
            // Here we will check the frequency of each character in the str1 is equal to the frequency of each character in the str2
            if (countFirst != countSecond){
                return false;
            }
        }
        return true;
    }
    // This is the Optimized Approach - T.C -> O(N) & S.C -> O(1) using HashMap
    public static boolean checkIsomorphic1(String str1, String str2) {
        // If the lengths are different, return false
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Create two hash maps to store character mappings
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            
            // Check if the current character in str1 is already mapped
            if (map1.containsKey(c1)) {
                // If the current mapping doesn't match, return false
                if (map1.get(c1) != c2) {
                    return false;
                }
            } else {
                map1.put(c1, c2);
            }
            
            // Check if the current character in str2 is already mapped
            if (map2.containsKey(c2)) {
                // If the current mapping doesn't match, return false
                if (map2.get(c2) != c1) {
                    return false;
                }
            } else {
                map2.put(c2, c1);
            }
        }
        
        return true;
    }
    public static void main(String args[]){
        String str1 = "egg";
        String str2 = "add";
        System.out.println(checkIsomorphic(str1, str2));
        System.out.println(checkIsomorphic1(str1, str2));
    }
}
