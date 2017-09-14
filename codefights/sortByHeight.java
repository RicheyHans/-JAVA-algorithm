/*
Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees.

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

Input/Output

[time limit] 3000ms (java)
[input] array.integer a

If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in the ith position.

Guaranteed constraints:
5 ¡Â a.length ¡Â 15,
-1 ¡Â a[i] ¡Â 200.

[output] array.integer

Sorted array a with all the trees untouched.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortByHeight {
	int[] sortByHeight(int[] a) {
	    List<Integer> humanList = new ArrayList<>();
		List<Integer> indexList = new ArrayList<>();
		List<Integer> resultList = new ArrayList<>(a.length);

	    for(int i=0; i < a.length; i++) {
			if(a[i] != -1) {
				humanList.add(a[i]);
			} else if(a[i] == -1) {
				indexList.add(i);
			}
		}
	    
	    int[] humanTmp = new int[humanList.size()];
			for(int i=0; i < humanList.size(); i++) {
				humanTmp[i] = humanList.get(i);
			}

	    Arrays.sort(humanTmp);

	    for(int i=0; i < humanTmp.length; i++) {
				resultList.add(humanTmp[i]);
		}

	   	for(int i = 0; i < indexList.size(); i++) {
			resultList.add(indexList.get(i), -1);
		}

	    Integer[] resultArrayInteger = resultList.toArray(new Integer[resultList.size()]);
		int[] resultArrayReturn = new int[resultArrayInteger.length];
		for(int i = 0; i < resultArrayInteger.length; i++) {
			resultArrayReturn[i] = resultArrayInteger[i].intValue(); 
		}
	    
	    return resultArrayReturn;
	}
}
