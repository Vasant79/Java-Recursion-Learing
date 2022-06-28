package PracticeQ;

public class StringCleanExample {

	public static void main(String[] args) {
		
		//thought process - remove one char if next same , add removed char if not same
		
		System.out.println("Printing only one char from same char : ");
		System.out.println(stringClean("1123asddfcvaaa"));

	}


		public static String stringClean(String str) {
			  
			  if(str.length()<2){
			    return str;
			  }

			  if(str.charAt(0)==str.charAt(1)){
			    return stringClean(str.substring(1));
			  }
			  return str.charAt(0)+ stringClean(str.substring(1));
			  
			}


}
