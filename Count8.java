package PracticeQ;

public class Count8 {

	public static void main(String args[]) {
		System.out.println("Counting no 8 present & doubling it if immidate left no is 8 :");
		System.out.println(count8(8182));
	}
	
	/* Given a non-negative integer n, compute recursively (no loops) the count of 
	 * the occurrences of 8 as a digit, except that an 8 with another 8 
	 * immediately to its left counts double, so 8818 yields 4.
	 */
	
	
	public static int count8(int n) {
	    if(n == 0)
	        return 0;
	          
	    if(n % 10 == 8) {
	        if((n / 10) % 10 == 8)
	            return 2 + count8(n/10);
	                            
	        return 1 + count8(n/10);
	    }
	                                    
	    return count8(n/10);
	}
}
