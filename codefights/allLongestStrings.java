
/*
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

Input/Output

[time limit] 3000ms (java)
[input] array.string inputArray

A non-empty array.

Guaranteed constraints:
1 ¡Â inputArray.length ¡Â 10,
1 ¡Â inputArray[i].length ¡Â 10.

[output] array.string

Array of the longest strings, stored in the same order as in the inputArray.
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class allLongestStrings {
	String[] allLongestStrings(String[] inputArray) {
		int[] arrayLength = new int[inputArray.length];
	    List<String> list = new ArrayList<>();
	    
	    for(int i = 0; i < inputArray.length; i++ ){
	        arrayLength[i] = inputArray[i].length();
	    }
	    
	    Arrays.sort(arrayLength);
	    
	    int maxLength = arrayLength[arrayLength.length-1];
	    
	    for(int i = 0; i < inputArray.length; i++){
	        if(inputArray[i].length() == maxLength){
	            list.add(inputArray[i]);
	        }
	    }
	    
	    String[] result = list.toArray(new String[list.size()]);
	    
	    return result;
	}
}
