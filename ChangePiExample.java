package PracticeQ;

public class ChangePiExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Replacing pi with 3.14 :");
		System.out.println(changePi("piabcd"));
	}
	
	public static String changePi(String str) {
		  if(str.length()<2){
		    return str;
		  }
		  
		  if(str.charAt(0)=='p' && str.charAt(1)=='i'){
		    return 3.14+changePi(str.substring(2));
		  }
		  return str.charAt(0)+changePi(str.substring(1));
		}


}
