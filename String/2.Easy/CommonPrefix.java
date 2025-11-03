// Leetcode - 14 Find the Longest Common Prefix 
public class CommonPrefix{
    public static String longestCommonPrefix(String str[]){
        if (str == null || str.length == 0){
            return "";
        }
        // Step 1: Take the first string as the initial prefix
        String prefix = str[0];
         // Step 2: Compare prefix with every next string
        for (int i = 1 ; i < str.length ; i++){
            // While the current string doesn't start with the prefix
            while (!str[i].startsWith(prefix)){
                // Remove the last character from prefix
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            // If prefix becomes empty, no common prefix exists
            if (prefix.isEmpty()){
                return "";
            }
        }
         // Step 3: Return the common prefix
        return prefix;
    }
    public static void main(String[] args) {
        String str[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
}