package PracticeQ;

//odd bunnies have 2 ears
//even have 3

public class BunnyEars2 {

	public static void main(String[] args) {
		
		System.out.println(bunnyEars2(6));

	}

	
	public static int bunnyEars2(int n) {
		if(n==0) {
			return 0;
		}
		else if(n%2 != 0) {
			return 2+bunnyEars2(n-1);
		}
		return 3+bunnyEars2(n-1);
	}
}
