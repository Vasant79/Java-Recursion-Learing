package PracticeQ;

/*
 Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.
 strCount("catcowcat", "cat") → 2
 */

public class StrCountExample {

	public static void main(String[] args) {
		
		System.out.println(strCount("catcowcat","cat"));

	}
	
	public static int strCount(String str, String sub) {
		  
		//  int strlen=str.length();
		  int sublen=sub.length();
		  
		  if(str.length()< sub.length() || str.length()==0){
		    return 0;
		  }
		  
		  if(str.substring(0,sublen).equals(sub)){
		    return 1+strCount(str.substring(sublen),sub);
		  }
		  
		  return strCount(str.substring(1),sub);
		  
		 
		  

		}


}
