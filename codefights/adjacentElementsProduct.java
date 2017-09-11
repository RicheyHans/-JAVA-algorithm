/*
	Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
	
	Example
	
	For inputArray = [3, 6, -2, -5, 7, 3], the output should be
	adjacentElementsProduct(inputArray) = 21.
	
	7 and 3 produce the largest product.
	
	Input/Output
	
	[time limit] 3000ms (java)
	[input] array.integer inputArray
	
	An array of integers containing at least two elements.
	
	Guaranteed constraints:
	2 ¡Â inputArray.length ¡Â 10,
	-1000 ¡Â inputArray[i] ¡Â 1000.
	
	[output] integer
	
	The largest product of adjacent elements.
 */

public class adjacentElementsProduct {
	int adjacentElementsProduct(int[] inputArray) {
	    
	    int arrayLength = inputArray.length;
	    int[] multipleArray = new int[arrayLength-1];
	    
	    for(int i=0; i<arrayLength-1; i++){
	        multipleArray[i] = inputArray[i] * inputArray[i+1];
	    }
	    
	    int max = multipleArray[0];
	    int multipleLength = multipleArray.length;
	    
	    for(int j=0; j < multipleLength; j++){
	        if( max < multipleArray[j] ){
	            max = multipleArray[j];
	        }
	    }
	    return max;
	}
}
