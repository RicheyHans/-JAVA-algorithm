/*
You have a string s that consists of English letters, punctuation marks, whitespace characters, and brackets. It is guaranteed that the parentheses in s form a regular bracket sequence.

Your task is to reverse the strings contained in each pair of matching parentheses, starting from the innermost pair. The results string should not contain any parentheses.

Example

For string s = "a(bc)de", the output should be
reverseParentheses(s) = "acbde".

Input/Output

[time limit] 3000ms (java)
[input] string s

A string consisting of English letters, punctuation marks, whitespace characters and brackets. It is guaranteed that parentheses form a regular bracket sequence.

Constraints:
5 ¡Â s.length ¡Â 55.

[output] string
*/

public class reverseParentheses {
	String reverseParentheses(String s) {
		   int firstIndex = 0, secondIndex = 0;
		        
		    while (s.contains("(")){
		           
		      s = s.replace("("+s.substring(s.lastIndexOf("(")+1, s.indexOf(")", s.lastIndexOf("(")))+")", 
		      new StringBuffer(s.substring(s.lastIndexOf("(")+1, s.indexOf(")", s.lastIndexOf("(")))).reverse().toString());
		    }
		    return s;
		}
}
