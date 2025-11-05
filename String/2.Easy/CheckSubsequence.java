public class CheckSubsequence {
    public static boolean checkSubsequence(String str1 , String str2){
        // Here we have taken two variable i and j . 
        // We are using the two pointer approach to solve this problem.
        // We are using the i pointer to traverse the str1 and j pointer to traverse the str2.
        // We are using the while loop to traverse the str1 and str2.
        // We are using the if condition to check if the character of str1 is equal to the character of str2.
        // If the character of str1 is equal to the character of str2 then we increment the j by 1.
        // We are using the i pointer to traverse the str1 and j pointer to traverse the str2.
        int i = 0 ;
        int j = 0 ;
        while ( i < str1.length() && j < str2.length()){
            //  We uses this approach to tell that if the character of str1 is equal to the character of str2 then we increment the j by 1.
            if (str1.charAt(i) == str2.charAt(j)){
                j++;
            }
            i++;
        }
        if (j != str2.length()){
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        String str1 = "ahbgdc";
        String str2 = "abc";
        System.out.println(checkSubsequence(str1,str2));
    }
}
