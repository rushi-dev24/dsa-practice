package Recursion;

public class SortCheck {
	boolean isSorted(int[] nums,int i) {
		if(i == nums.length-1)return true;
		if(i < nums.length-1 && nums[i]<=nums[i+1])return isSorted(nums, i+1);
		return false;
	}
}
