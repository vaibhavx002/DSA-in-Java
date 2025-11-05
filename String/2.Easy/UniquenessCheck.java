public class UniquenessCheck {
    public static boolean checkUnique(String str){
        if (str == null || str.length() == 1){
            return true;
        }
        for (int i = 0 ; i < str.length() ; i++){
            int count = 0 ;
            for (int j = i+1 ; j < str.length() ; j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if (count > 0 ){
                return false;
            }
        }
        return true;
    }   
    public static void main(String args[]){
        String str = "abcdea";
        System.out.println(checkUnique(str));
    } 
}
