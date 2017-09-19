import java.util.Arrays;

public class areSimilar {
	boolean areSimilar(int[] a, int[] b) {

    int cnt = 0;
    boolean result = false;
		
    for(int i = 0; i < a.length; i++) {
		if(a[i] != b[i]) {
			cnt++;
			}
		}
	    
	Arrays.sort(a);
	Arrays.sort(b);
			
	if(Arrays.equals(a, b)){
		if(cnt <= 2) { result = true; 
		} else {result = false;}
	} else {
		result = false; 
		}           
	 return result;
	}
}
