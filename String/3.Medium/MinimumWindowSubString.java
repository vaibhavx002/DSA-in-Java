public class MinimumWindowSubString {
    public static void minimumWindow(String str){
        String search = "ABC";
        int start = 0 ;
        int end = 0 ;
        while (end < str.length()){
            if (search.indexOf(str.charAt(end)) != -1){
                start++;
            }
            end ++;
        }
    }
    public static void main(String args[]){
        String str = "ADOBECODEBANC";
        minimumWindow(str);
    }
}
