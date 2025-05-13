import java.util.*;
import java.util.stream.*;
import java.util.HashMap;

class RomanToInteger {
    RomanToInteger(String roman){
        roman = roman.toUpperCase();
        
          Map <Character, Integer> romanMap = new HashMap<>();
        
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        char [] romanArray = roman.toCharArray();
        int integer = romanMap.get(romanArray[romanArray.length-1]);
        //int integer = 0;
        
        for(int i = 0 ; i<romanArray.length-1 ; i++){
            if(romanMap.get(romanArray[i]) >= romanMap.get(romanArray[i+1])){
                integer += romanMap.get(romanArray[i]);
               
            }
            else{
                integer += -romanMap.get(romanArray[i]);
                
            }
          
        }
              System.out.println(integer);

    }
}
//

public class main {
    public static void main(String[] args) {

        RomanToInteger number = new RomanToInteger("xC");
    
        
    }
}
