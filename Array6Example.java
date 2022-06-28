package PracticeQ;

public class Array6Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("finding 6 in array : ");
		
		//declaring array
		int nums[]= {1,2,33,4,5,6};
		
		System.out.println(array6(nums, 0));

	}
	
	public static boolean array6(int[] nums, int index) {
		  if(nums.length== index){
		    return false;
		  }
		  
		  /* problem area - base condition & nums[0]
		   instead nums[0] put nums[index]
		  nums[0] will only check for  perence of 6 in 1st index 
		  in nums[index] it will check for chanaging index;
		  */
		  
		  if(nums[index]==6){
		    return true;
		   
		  }
		   return array6(nums,index+1);
		
	}
}

