package PracticeQ;

public class Count11Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Printing number of 11 in array : ");
		
		//declaring array
		int nums []= {11,2,3,11,3,11,11};
		
		System.out.println(array11(nums,0));
		
		}
		

	
	
	public static int array11(int[] nums, int index) {
		  if(nums.length==index){
		    return 0;
		  }
		  
		  if(nums[index]==11){
		   return 1 + array11(nums,index+1);
		  }
		  return array11(nums,index+1);
		}


}
