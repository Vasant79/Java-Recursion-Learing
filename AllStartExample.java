package PracticeQ;

public class AllStartExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("printing * after every alphabat : ");
		System.out.println(allStar("hello"));
	}
	
	public static String allStar(String str) {
		  
		  if(str.length()==0 || str.length()==1){
		    return str;
		  }
		  return str.charAt(0)+"*"+allStar(str.substring(1));
		}


}
