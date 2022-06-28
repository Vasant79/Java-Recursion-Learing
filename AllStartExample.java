/*  Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
allStar("hello") → "h*e*l*l*o"  */


public class AllStarExample {

	public static void main(String[] args) {
		

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
