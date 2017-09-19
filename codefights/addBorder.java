/*
Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
Input/Output

[time limit] 3000ms (java)
[input] array.string picture

A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 ¡Â picture.length ¡Â 5,
1 ¡Â picture[i].length ¡Â 5.

[output] array.string

The same matrix of characters, framed with a border of asterisks of width 1.
*/

import java.util.ArrayList;
import java.util.List;

public class addBorder {
	
	String[] addBorder(String[] picture) {

	    String aster = "";
			
		List<String> list = new ArrayList<>();
		List<String> edge = new ArrayList<>();

	    int lengthPic = picture[0].length();

	    for(int i = 0; i < lengthPic + 2; i++) {
				aster = aster + "*";
		}
	    
	    for(int i = 0; i < picture.length; i++) {
				picture[i] = "*"+picture[i]+"*";
		}
	    
	    edge.add(aster);
		
	    for(int i = 0; i < picture.length; i++) {
	        edge.add(picture[i]);
	    }
			
	    edge.add(aster);
	    
	    String[] result = edge.toArray(new String[edge.size()]);
	    
	    return result;
	}
}
