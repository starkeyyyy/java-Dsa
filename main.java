import java.util.*;

class Solution {
     public int myAtoi(String s) {
    int num = 0;
    int i = 0;
    s = s.trim();

    if (s.length() == 0) return 0;

    int sign = 1;
    StringBuilder sb = new StringBuilder(s);

    if (sb.charAt(0) == '-') {
        sign = -1;
        i = 1;
    } else if (sb.charAt(0) == '+') {
        i = 1;
    }

    for (int j = i; j < sb.length(); j++) {
        if (sb.charAt(j) >= '0' && sb.charAt(j) <= '9') {
            int digit = sb.charAt(j) - '0';
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
        } else {
            break;
        }
    }

    return num * sign;
}

}

public class main {
    public static void main(String[] args) {
        Solution S = new Solution();
        System.out.println(S.myAtoi("-990sdfgs909kja;lfjoafo"));

    }
}