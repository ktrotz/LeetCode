package Palindrome;

public class Solution {
    public static boolean isPalindrome(int x) {

        String reverse = "";
        String check = Integer.toString(x);

        for (int n = check.length() - 1; n >= 0; n--) {
            reverse = reverse + check.charAt(n);
        }

        if (reverse.equalsIgnoreCase(check)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int x = -121;
        System.out.println(isPalindrome(x));

    }
}