package _04_sliding_window;

import java.util.Arrays;

public class SubarrayofSizeKwithTarget {
	public static void main(String[] args) {
		solve(new int[] {2, 1, 5, 1, 3, 3}, 2, 6);
		
	}
	public static void solve(int[] nums,int k,int target) {
		if(nums==null || nums.length==0 || k>nums.length)return;
		int n=nums.length,runningSum=0;
		for(int i=0;i<k;i++)runningSum+=nums[i];
		for(int i=k;i<n;i++) {
			if(runningSum == target) {
				System.out.println(Arrays.toString(Arrays.copyOfRange(nums, i-k, i)));
			}
			runningSum=runningSum-nums[i-k]+nums[i];
		}	
		if(runningSum==target) {
			System.out.println(Arrays.toString(Arrays.copyOfRange(nums, n-k, n)));
		}
	}

}
