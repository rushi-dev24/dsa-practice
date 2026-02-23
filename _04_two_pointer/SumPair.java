public class Main{
	public boolean hadPair(int[] nums,int target){
	    if(nums == null || nums.length == 0) return false;
	    int n=nums.length,i=0,j=n-1;
	    while(i<j){
	        int sum=nums[i]+nums[j];
	        if(sum == target) return true;
	        else if(sum < target) i++;
	        else j--;
	    }
	    return false;
	}
}
