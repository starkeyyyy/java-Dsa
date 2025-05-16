import java.util.*;

class Solution {
    public String intToRoman(int num) {
        StringBuilder str = new StringBuilder();
        int []array = {1 ,4 , 5 ,9 ,  10 ,40 ,  50 , 90 ,  100 , 400 , 500 , 900 , 1000};
        String [] symbols = {"I" , "IV" ,"V" ,  "IX" ,"X",  "XL" ,"L", "XC" ,"C" ,  "CD", "D" , "CM" , "M"};
        for(int i = array.length-1 ; i >= 0  ; i--){
            while(num >= array[i]){
                num = num - array[i];
                str= str.append(symbols[i]);
            }
        
    }
    return str.toString();
}
}

public class main {
    public static void main(String[] args) {
        Solution S = new Solution();
        System.out.println(S.intToRoman(99));

    }
}