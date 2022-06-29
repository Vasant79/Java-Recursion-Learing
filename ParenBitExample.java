package PracticeQ;

/* 
Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
parenBit("xyz(abc)123") → "(abc)"
*/

public class ParenBitExample {

	public static void main(String[] args) {
		
		System.out.println(parenBit("abcd(asxv)rt"));

	}
	
	public static String parenBit(String str) {
		  if(str.length()==0){
		    return str;
		  }
		  
		  if(str.charAt(0)=='('){
		    if(str.charAt(str.length()-1) ==')'){
		      return str;
		    }else{
		      return parenBit(str.substring(0,str.length()-1));
		    }
		  }
		  
		  return parenBit(str.substring(1));
		}


}
