import java.util.*;

class Solution {
    public int reverse(int x) {
        int num = 0;

        while (x != 0) {
            int digit = x % 10;

            // Checking for over flow conditions of an integer because the integer has
            // limited space value
            // Condition Reason
            // num > MAX_VALUE / 10 Will overflow even without digit
            // num == MAX_VALUE / 10 Needs digit ≤ 7 to stay safe
            // num < MIN_VALUE / 10 Will underflow
            // num == MIN_VALUE / 10 Needs digit ≥ -8 to stay safe
            // so if any number is on the verge of overflow we also need to check the last digit
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (num < Integer.MIN_VALUE / 10 || (num == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            num = num * 10 + digit;
            x = x / 10;
        }

        return num;
    }
}

public class main {
    public static void main(String[] args) {
        Solution S = new Solution();
        System.out.println(S.reverse(-2147483412));

    }
}