import java.util.*;

class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] result = {-1, -1};        
        // Find first occurrence
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                result[0] = mid;
                high = mid - 1; // keep searching on left
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Find last occurrence
        low = 0; high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                result[1] = mid;
                low = mid + 1; // keep searching on right
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
}}
public class main {
    public static void main(String[] args) {
        Solution S = new Solution();
        int arr[] = {5,7,8,8,8,10};
        System.out.println(Arrays.toString(S.searchRange(arr , 8)));
    }
}