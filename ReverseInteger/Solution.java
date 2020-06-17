package ReverseInteger;

public class Solution {

    public static int reverse(int x) {

        String reverse = "";
        int negative;
        if (x < 0) {
            negative = 1;
            reverse = "-";
        } else {
            negative = 0;
            reverse = "";
        }

        String input = Integer.toString(x);

        for (int n = input.length() - 1; n >= negative; n--) {
            reverse = reverse + input.charAt(n);
        }

        if ((Long.parseLong(reverse) > 2147483647) || (Long.parseLong(reverse) < -2147483648)) {
            return 0;
        }

        return Integer.parseInt(reverse);
    }

    public static void main(String[] args) {

        int x = -2147483648;
        System.out.println(reverse(x));
    }

}