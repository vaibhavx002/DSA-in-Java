public class FirstRepeating {
    public static void firstRepeating(String str){
        if (str == null || str.length() == 0){
            System.out.println("No Repeating Character");
            return;
        }
        for (int i = 0 ; i < str.length() ; i++){
            int count = 0 ;
            for (int j = i+1 ; j< str.length() ; j++){
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if (count > 0){
                System.out.println("First Repeating Character is : " + str.charAt(i));
                return;
            }
        }
        System.out.println("No Repeating Character");
    }
    public static void main(String args[]){
        String str = "abcdec";
        firstRepeating(str);
    }
}
