package PracticeQ;

public class CountPairsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Counting pair as 1 if two same letter seperated by one :");
		System.out.println(countPairs("abacdcfef"));
	}
	
	public static int countPairs(String str) {
		  if(str.length()<3){
		    return 0;
		  }
		  
		  if(str.charAt(0)==str.charAt(2)){
		    return 1+countPairs(str.substring(1));
		  }
		  
		  return countPairs(str.substring(1));
		}


}
