package PracticeQ;

public class RecurrsionExample {
	
	public static int factorial(int n) {
		if(n<1) {
			return 1;
		}
		return n*factorial(n-1); //identify recursion
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Factorial using recurrsion");
		System.out.print(factorial(-10));
	}

}
