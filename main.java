import java.util.*;

class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        // Ensure num1 is longer
        if (num2.length() > num1.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        List<String> partials = new ArrayList<>();

        for (int i = num2.length() - 1; i >= 0; i--) {
            int carry = 0;
            StringBuilder sb = new StringBuilder();

            int digit2 = num2.charAt(i) - '0';

            for (int j = num1.length() - 1; j >= 0; j--) {
                int digit1 = num1.charAt(j) - '0';
                int prod = digit1 * digit2 + carry;
                sb.insert(0, prod % 10);
                carry = prod / 10;
            }

            if (carry > 0) {
                sb.insert(0, carry);
            }

            // Add trailing zeros
            sb.append("0".repeat(num2.length() - 1 - i));
            partials.add(sb.toString());
        }

        // Sum all partials
        int maxLength = 0;
        for (String s : partials) {
            maxLength = Math.max(maxLength, s.length());
        }

        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int sum = carry;
            for (String s : partials) {
                int idx = s.length() - 1 - i;
                if (idx >= 0) sum += s.charAt(idx) - '0';
            }
            result.append(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }
}

//efficient way using array indexing (i could never)
class Solution2 {
    public String multiply(String num1, String num2) {
    int m = num1.length(), n = num2.length();
    int[] pos = new int[m + n];
   
    for(int i = m - 1; i >= 0; i--) {
        for(int j = n - 1; j >= 0; j--) {
            int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
            int p1 = i + j, p2 = i + j + 1;
            int sum = mul + pos[p2];

            pos[p1] += sum / 10;
            pos[p2] = (sum) % 10;
        }
    }  
    
    StringBuilder sb = new StringBuilder();
    for(int p : pos) if(!(sb.length() == 0 && p == 0)) sb.append(p);
    return sb.length() == 0 ? "0" : sb.toString();
}
}

public class main {
    public static void main(String[] args) {
        Solution S = new Solution();
        System.out.println(S.multiply("91333", "0"));
    }
}