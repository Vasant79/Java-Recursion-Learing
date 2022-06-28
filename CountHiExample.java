package PracticeQ;

public class CountHiExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Counting no of Hi :");
		System.out.println(countHi("xyahidehihqhijkhi"));

	}

	
	public static int countHi(String str) {
		
		if(str.length()<2) {
			return 0;
		}
		
		if(str.charAt(0)=='h' && str.charAt(1)=='i') {
			return 1+ countHi(str.substring(2));
		}
		
		return countHi(str.substring(1));
	}
}
