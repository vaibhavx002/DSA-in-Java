public class RemoveCharacter {
    public static void removeCharacter(String str1, String str2){
        if (str1 == null || str1.length() == 0){
            System.out.println("No Repeating Character");
            return;
        }
        int i = 0 ;
        StringBuilder sb = new StringBuilder(str1);
        while ( i < str2.length()){
            for (int j = 0 ; j < sb.length() ; j++){
                if (str2.charAt(i) == sb.charAt(j)){
                    sb.deleteCharAt(j);
                    j--;
                }
            }
            i++;
        }
        System.out.print(sb.toString());
    }
    public static void main(String args[]){
        String str1 = "abcdec";
        String str2 = "ac";
        removeCharacter(str1, str2);
    }
}
