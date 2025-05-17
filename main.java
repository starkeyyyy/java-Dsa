import java.util.*;

class Solution {
    public int strStr(String haystack, String needle) {
        int index = 0;
        String result = haystack.replace(needle , "-");
        for(int i = 0 ; i < haystack.length() ; i++){
            if(result.contains("-")){
                if(result.charAt(i) == '-'){
                index = i;
                break;
            }
            }
            else{
                return -1;
            }
        }
    return index;  
    }
}
public class main {
    public static void main(String[] args) {
        Solution S = new Solution();
        System.out.println(S.strStr("hello", "ll"));
    }
}