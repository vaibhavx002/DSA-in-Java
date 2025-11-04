// Remove all adjacent duplicates – (LeetCode 1047)
public class RemoveAdjacentDuplicate {
    public static String removeDuplicate(String str){
        // We Will Use the String Builder to Store the Character 
        // If the String is null or empty, return the string as it is
        StringBuilder sb = new StringBuilder();
        if (str == null || str.length()==0){
            return str;
        }
        // We will traverse the string and check if the current character is equal to the last character in the string builder
        // If it is equal, we will delete the last character from the string builder
        // If it is not equal, we will append the current character to the string builder
        for (int i = 0 ; i < str.length() ; i++){
            if (sb.length()>0 && sb.charAt(sb.length()-1) == str.charAt(i)){
                sb.deleteCharAt(sb.length()-1);
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        // We will return the string builder as a string
        return (sb.toString());
    }
    public static void main(String args[]){
        String str = "abbaca";
        System.out.println(removeDuplicate(str));
    }
}
// Time Complexity - O(N)
// Space Complexity - O(N) -> In the worst case, all characters are unique, so we need to store all characters in the string builder
