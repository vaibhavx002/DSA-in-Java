public class BasicStringCompression {
    public static String stringCompression(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < str.length() ; i++){
            if (i == str.length()-1 || str.charAt(i) != str.charAt(i+1)){
                sb.append(str.charAt(i));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "aabcccccaaa";
        System.out.println(stringCompression(str));
    }
}
