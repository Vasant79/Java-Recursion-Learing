package PracticeQ;

public class EndXExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("printing x at the end of string : ");
		System.out.println(endX("xyza"));

	}
	
	public static String endX(String str) {
		  char x='x';
		  
		  if(str.length()==0 || str.length()==1){
		    return str;
		  }
		  
		  if(str.charAt(0)=='x'){
		    return endX(str.substring(1))+x;
		  }
		  
		  return str.charAt(0)+endX(str.substring(1));
		}


}
