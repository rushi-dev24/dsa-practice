package Recursion;

public class FindMaximum {
	int max(int[] nums, int i){
		if(i == nums.length-1)return nums[i];
		return Math.max(nums[i], max(nums,i+1));
	}
}
