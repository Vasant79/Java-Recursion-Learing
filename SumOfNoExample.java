package PracticeQ;

public class SumOfNoExample {

	public static void main(String[] args) {
		
		System.out.println("Using recursion printing sum of no :");
		System.out.println(sumofno(-16));
		
	}
	
	public static int sumofno(int n) {
		//base condition //constraints
		if(n==0 || n<0) {
			return 0;
		}
		
		//identifying recursion
		return (n%10)+sumofno(n/10);
	}

}
