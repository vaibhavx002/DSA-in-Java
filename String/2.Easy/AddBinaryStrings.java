public class AddBinaryStrings {
    public static String addBinary(String str1 , String str2){
        // If the strings are null or empty, return the string as it is
        if (str1 == null || str1.length() == 0){
            return str2;
        }
        if (str2 == null || str2.length() == 0){
            return str1;
        }
        // We will use the StringBuilder to store the result
        int i = str1.length()-1;
        int j = str2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        // We will traverse the strings from the end to the beginning
        // We will add the corresponding bits of the strings and the carry
        // We will append the result to the string builder
        // We will update the carry
        // We will continue the loop until we have traversed both strings and the carry is 0
        while (i >= 0 || j >= 0 || carry == 1){
            int sum = carry;
            if (i >= 0 ){
                // If the current character is 1, add 1 to the sum
                // As '0' value is 48 in ASCII, we need to subtract '0' to get the actual value and '1' is 49 in ASCII
                // So, if the current character is 1, we will add 1 to the sum
                sum = sum + str1.charAt(i) - '0';
                i--;
            }
            if (j >= 0){
                sum = sum + str2.charAt(j) - '0';
                j--;
            }
            // We will append the result to the string builder
            // We will update the carry
            sb.append(sum%2);
            carry = sum/2;
        }
        return sb.reverse().toString();
    }
    public static void main(String args[]){
        String str1 = "11";
        String str2 = "1";
        System.out.println(addBinary(str1, str2));
    }
}
