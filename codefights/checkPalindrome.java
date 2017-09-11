/*	
  	Given the string, check if it is a palindrome.

	Example
	
	For inputString = "aabaa", the output should be
	checkPalindrome(inputString) = true;
	
	For inputString = "abac", the output should be
	checkPalindrome(inputString) = false;
	
	For inputString = "a", the output should be
	checkPalindrome(inputString) = true.
	
	Input/Output
	
	[time limit] 3000ms (java)
	[input] string inputString
	
	A non-empty string consisting of lowercase characters.
	
	Guaranteed constraints:
	1 ¡Â inputString.length ¡Â 105.
	
	[output] boolean
	
	true if inputString is a palindrome, false otherwise.
*/

public class checkPalindrome {

	boolean checkPalindrome(String inputString) {
		 
		char[] revStr = new char[inputString.length()];
	    char[] inputStr = inputString.toCharArray();
	    
	    for(int i = inputString.length()-1; i >= 0; i--) {
	    	revStr[inputString.length()-1-i] = inputStr[i];
	    }    
	    String revStrs = new String(revStr,0,revStr.length);
	    String inputStrs = new String(inputStr,0,inputStr.length);
	    
 	    if(revStrs.equals(inputStrs)) {
 	    	return true;
 	    } else {return false;}
	}

}
