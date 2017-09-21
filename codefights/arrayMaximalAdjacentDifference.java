
/*
Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.


Example

For inputArray = [2, 4, 1, 0], the output should be
arrayMaximalAdjacentDifference(inputArray) = 3.

Input/Output

[time limit] 3000ms (java)
[input] array.integer inputArray

Guaranteed constraints:
3 ¡Â inputArray.length ¡Â 10,
-15 ¡Â inputArray[i] ¡Â 15.

[output] integer

The maximal absolute difference.
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayMaximalAdjacentDifference {
	int arrayMaximalAdjacentDifference(int[] inputArray) {
    int[] minusArray = new int[inputArray.length-1];
	List<Integer> list = new ArrayList<>();
    
    for(int i = 0; i < inputArray.length-1; i++) {
		int minus = Math.abs(inputArray[i] - inputArray[i+1]);
		list.add(minus);
	}
	    
    for(int i = 0; i< minusArray.length; i++) {
		minusArray[i] = list.get(i);
	}
			
	Arrays.sort(minusArray);
    
    int result = minusArray[minusArray.length-1];
	    
    return result;
	}
}
