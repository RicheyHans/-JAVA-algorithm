/*
Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

Input/Output

[time limit] 3000ms (java)
[input] string s1

A string consisting of lowercase latin letters a-z.

Guaranteed constraints:
1 ¡Â s1.length ¡Â 15.

[input] string s2

A string consisting of lowercase latin letters a-z.

Guaranteed constraints:
1 ¡Â s2.length ¡Â 15.

[output] integer
*/

public class commonCharacterCount {
	int commonCharacterCount(String s1, String s2) {
	    int cnt = 0;
	    
	    char[] s1Char = s1.toCharArray();
	    char[] s2Char = s2.toCharArray();
	    
	    for(int i = 0; i < s1Char.length; i++){
	        for(int j = 0; j < s2Char.length; j++){
	            if(s1Char[i]==s2Char[j]){
	                cnt++;
	                s1Char[i] = ' ';
	                s2Char[j] = ' ';
	                break;
	            }
	        }
	    }
	    return cnt;
	}
}
