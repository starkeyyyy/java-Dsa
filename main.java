import java.util.*;

class Solution {
    public int maxArea(int[] height) {
       int maxArea = 0;
       int start = 0;
       int end = height.length-1;
       while(start <= end){

        if(height[start] < height[end]){
            maxArea = Math.max(Math.min(height[start] , height[end]) * (end - start) , maxArea);
            start++;
        }
        if(height[start]> height[end]){
            maxArea = Math.max(Math.min(height[start] , height[end]) * (end - start) , maxArea);
            end--;
        }
        if(height[start] == height[end]){
            maxArea = Math.max(Math.min(height[start] , height[end]) * (end - start) , maxArea);
            end--;
        }

       }
       return maxArea;
}}

public class main {
    public static void main(String[] args) {
        Solution S = new Solution();
        int [] arr = {1,2,1};
        System.out.println(S.maxArea(arr));
    }
}