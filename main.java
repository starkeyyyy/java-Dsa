import java.util.*;

// class Solution {
//     public int[] plusOne(int[] digits) {

//         int carry = 1; // assuming you want to add 1 initially
//         for (int i = arr.length - 1; i >= 0; i--) {
//             int sum = arr[i] + carry;
//             arr[i] = sum % 10;
//             carry = sum / 10;
//         }

//     }
// }

class Solution {
    public String triangleType(int[] nums) {
        int count = 0;
        String triangle = new String();       
        for (int i = 0; i < nums.length; i++) {
            int i1 = (i + 1) % nums.length;
            int i2 = (i + 2) % nums.length;
            int i3 = (i + 3) % nums.length;
            if (nums[i1] + nums[i2] > nums[i3]) {
                count++;
            }
        }
        if(count == 3){
            if (nums[0] == nums[1] && nums[1] == nums[2] && nums[0] == nums[2]) {
            triangle =  "equilateral";
        }
        else if(nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2]){
            triangle = "scalene";
        }
        else{
            triangle = "isosceles";
        }
        }
        return count == 3 ? triangle : "none";
    }
}

public class main {
    public static void main(String[] args) {
        Solution S = new Solution();
        int[] arr = { 3, 4, 4 };
        System.out.println(S.triangleType(arr));
    }
}