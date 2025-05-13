import java.util.*;
import java.util.stream.*;

class Wealth {
    Wealth(int [][] arr){
        int maxWealth = 0;
        for (int customer[] : arr) {
            int sum = Arrays.stream(customer).sum();
             maxWealth = (sum > maxWealth) ? sum : maxWealth; 
        }
        System.out.println("the max wealth is" + maxWealth);
            

    }
}

public class main {
    public static void main(String[] args) {
        int[][] ogArray = {{1, 200, 3}, {2, 9 ,6} , {2 , 7 , 9}};

        Wealth person = new Wealth(ogArray);
    
        
    }
}
