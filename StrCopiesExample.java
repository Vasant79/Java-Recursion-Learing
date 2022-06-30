package PracticeQ;

/*
 
Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.
strCopies("catcowcat", "cat", 2) → true
strCopies("iiiiij", "iii", 4)
 */
public class StrCopiesExample {

	public static void main(String[] args) {
		
		System.out.println(strCopies("catcowcat", "cat", 2));

	}
	
	public static boolean strCopies(String str, String sub, int n) {
		  
		 if(func(str,sub)==n){
		   return true;
		 }
		 return false;
		  
		  
		}

		private static int func(String str, String sub){
		  int strlen=str.length();
		  int sublen=sub.length();
		  
		  if( strlen < sublen){
		    return 0;
		  }
		  if( str.substring(0,sublen).equals(sub)){
		    
		    //faced problem here 
		    return 1+ func(str.substring(1),sub);

		  }
		  return func(str.substring(1),sub);
		}

}
