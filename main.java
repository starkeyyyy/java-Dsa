
import java.util.*;
class Solution {
    public int[] plusOne(int[] digits) {
    int num = 0;
    for(int i = 0 ; i <= digits.length-1 ; i++){
        num*=10;
        num += digits[i];
    }
    num +=1;
    String string = String.valueOf(num);
    int arr[] = new int[string.length()];
    System.out.println(string);
    for (int j = arr.length-1 ; j >= 0 ; j--){   
        arr[j] = num%10;
        num/=10;
        System.out.println(arr[j]);
    }
    System.out.println(Arrays.toString(arr));
    return arr;
}
}
class Solution2 {
    public int[] plusOne(int[] digits) {
        //1. if last ith digit is less than 9, we add that digit by 1 in-place and return digits array.
        if(digits[digits.length - 1] < 9){
            digits[digits.length - 1] += 1;
            return digits;
        }
        //2. declaring an ArrayList so we can insert and append values, when a carry-over occurs, it will be a copy of digits array.
        ArrayList<Integer> result = new ArrayList<>();
        for(int digit: digits){
            result.add(digit);
        }
        result.set(digits.length - 1, 0);
        if(result.size() == 1){
            result.add(0, 1);
        }
        for(int i = digits.length - 2; i >= 0; i --){
            if(digits[i] == 9){
                result.set(i, 0);
                if(i == 0){
                    result.add(0, 1);
                }
            }
            else{
                result.set(i, result.get(i) + 1);
                break;
            }
        }
        int[] resultToArray = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            resultToArray[i] = result.get(i);
        }
        return resultToArray;
    }
}

public class main {
    public static void main(String[] args) {
        Solution S = new Solution();
        Solution2 S2 = new Solution2();
        int [] Arr = {9,8,7,6,5,4,3,2,1,0};
        S.plusOne(Arr);//creative solution but worst time complexity
        S2.plusOne(Arr);//0ms time solution using arrayList
    }

    
}