/*
Given a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
palindromeRearranging(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.

Input/Output

[time limit] 3000ms (java)
[input] string inputString

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ¡Â inputString.length ¡Â 50.

[output] boolean

true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.
*/

public class palindromeRearranging {
	boolean palindromeRearranging(String inputString) {
	int[] niz = new int[26];
	    
	for(int i=0; i<inputString.length(); i++){
	    niz[inputString.charAt(i)-'a']++;
	}

	int cnt=0;
	for(int i=0; i<niz.length; i++){
		if(niz[i]%2!=0){
			cnt++;
			}
		}
	return cnt<=1;
	}
}
