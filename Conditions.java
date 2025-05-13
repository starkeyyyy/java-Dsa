import java.util.*;

class Arraysums {
    public int[] arraySum(int[] arr) {
        int[] sum = new int[arr.length];  // Initialize the sum array
        sum[0] = arr[0];  // Start by assigning the first element

        for (int i = 1; i < arr.length; i++) {  // Start from index 1 to avoid arr[i-1] out of bounds
            sum[i] = arr[i] + arr[i - 1];  // Add the current element to the previous element
        }

        return sum;  // Return the sum array
    }
}

public class Conditions {
    public static void main(String[] args) {
        int[] ogArray = {1, 2, 3};
        Arraysums a = new Arraysums();
        int[] result = a.arraySum(ogArray);  // Pass the original array to the method

        // Print the result
        System.out.println("Sum Array: " + Arrays.toString(result));
    }
}
