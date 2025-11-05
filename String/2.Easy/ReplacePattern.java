public class ReplacePattern {
    public static String replacePattern(String str , String Pattern , String Replacement){
        if (str == null || str.isEmpty()){
            return str;
        }
        if (Pattern == null || Pattern.isEmpty()){
            return str;
        }
        // We are using the replaceAll method to remove the special characters from the str.
        str = str.replaceAll("[^a-zA-Z0-9 ]", "");
        // We are using the replaceAll method to replace the Pattern with the Replacement.
        str = str.replaceAll(Pattern, Replacement);
        return str;
    }
    public static void main(String args[]){
        String str = "abcabcabc";
        String Pattern = "abc";
        String Replacement = "x";
        System.out.println(replacePattern(str,Pattern,Replacement));
    }
}
