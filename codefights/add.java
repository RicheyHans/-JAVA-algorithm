/*
Write a function that returns the sum of two numbers.

Example

For param1 = 1 and param2 = 2, the output should be
add(param1, param2) = 3.

Input/Output

[time limit] 3000ms (java)
[input] integer param1

Guaranteed constraints:
-100 ¡Â param1 ¡Â 1000.

[input] integer param2

Guaranteed constraints:
-100 ¡Â param2 ¡Â 1000.

[output] integer

The sum of the two inputs.
*/

public class add {
	int add(int param1, int param2) {
	    int result = 0;
	    
	    if(((param1 >= -100)&&(param1 <= 1000)) && ((param2 >= -100)&&(param2 <= 1000))) {
	        result = param1 + param2;
	    }
	    return result;
	}
}
