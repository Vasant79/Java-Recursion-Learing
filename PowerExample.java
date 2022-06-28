package PracticeQ;

public class PowerExample {

	public static void main(String[] args) {
		System.out.println("Finding power using recursion :");
		System.out.println(power(2,4));
	}
	
	public static int power(int base, int n) {
		  if(base==0){
		    return 0;
		  }
		  if(n==0){
		    return 1;
		  }
		  return (base)*power(base,n-1);
		}


}
