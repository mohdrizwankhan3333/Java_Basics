public class isPalindrome {

    public static boolean sPalindrome(String s, int l, int r) {

        // base case: crossed or single char
        if (l >= r) return true;

        // mismatch → not palindrome
        if (s.charAt(l) != s.charAt(r)) return false;

        // move inward
        return sPalindrome(s, l + 1, r - 1);
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(sPalindrome(str, 0, str.length() - 1)); // true

        String str2 = "hello";
        System.out.println(sPalindrome(str2, 0, str2.length() - 1)); // false
    }
}
