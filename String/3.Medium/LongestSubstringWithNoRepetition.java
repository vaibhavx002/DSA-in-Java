public class LongestSubstringWithNoRepetition {
    public static void longest(String str) {
        if (str == null || str.length() == 0) {
            System.out.println(0);
            return;
        }

        int n = str.length();
        StringBuilder sb = new StringBuilder();
        int maxLen = 0;

        sb.append(str.charAt(0));
        maxLen = 1;

        for (int i = 1; i < n; i++) {
            int index = check(sb.toString(), str.charAt(i));

            // if duplicate found, delete from start till the duplicate
            if (index != -1) {
                sb.delete(0, index + 1);
            }

            // always append the current character
            sb.append(str.charAt(i));

            // update maxLen
            if (sb.length() > maxLen) {
                maxLen = sb.length();
            }
        }

        System.out.println(maxLen);
    }

    // return index if found, else -1
    public static int check(String sb, char ch) {
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        String str = "abcabcbb";
        longest(str);
    }
}
