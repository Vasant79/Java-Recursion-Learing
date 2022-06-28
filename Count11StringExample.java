package PracticeQ;

public class Count11StringExample {

	public static void main(String[] args) {

		
		System.out.println("Counting 11 in a string as 1 only if in even : ");
		System.out.println(count11("1111111abcd11ndfgac1"));

	}

	public static int count11(String str) {
		  if(str.length()<2){
		    return 0;
		  }

		  
		  if(str.charAt(0)=='1' && str.charAt(1)=='1'){
		    return 1+count11(str.substring(2));
		  }
		  return count11(str.substring(1));
		}

}
