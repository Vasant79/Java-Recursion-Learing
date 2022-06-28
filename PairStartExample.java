package PracticeQ;

public class PairStartExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("printing * between 2 same letters in string :");
		System.out.println(pairStar("hello"));

	}
	
	public static String pairStar(String str) {
		  if(str.length()==0 || str.length()==1){
		    return str;
		  }
		  if(str.charAt(0)==str.charAt(1)){
		    return str.charAt(0)+"*"+pairStar(str.substring(1));
		  }
		  return str.charAt(0)+pairStar(str.substring(1));
		  
		}


}
