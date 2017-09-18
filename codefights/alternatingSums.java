/*
Several people are standing in a row and need to be divided into two teams. The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.

You are given an array of positive integers - the weights of the people. Return an array of two integers, where the first element is the total weight of team 1, and the second element is the total weight of team 2 after the division is complete.

Example

For a = [50, 60, 60, 45, 70], the output should be
alternatingSums(a) = [180, 105].

Input/Output

[time limit] 3000ms (java)
[input] array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 10,
45 ≤ a[i] ≤ 100.

[output] array.integer
*/

import java.util.ArrayList;
import java.util.List;

public class alternatingSums {
	int[] alternatingSums(int[] a) {
	  List<Integer> teamA = new ArrayList<>();
		List<Integer> teamB = new ArrayList<>();
		int teamAsum = 0;
		int teamBsum = 0;

	    for(int i = 0; i < a.length; i++ ) {
			if(i % 2 == 0) {
				teamA.add(a[i]);
			} else {
	            teamB.add(a[i]);
			}
		}

	    for(int i = 0; i < teamA.size(); i++) {
			teamAsum = teamAsum + teamA.get(i);
		}

	    for(int i = 0; i < teamB.size(); i++) {
			teamBsum = teamBsum + teamB.get(i);
		}

	    int[] result = {teamAsum, teamBsum};

	    return result;

	}
}
