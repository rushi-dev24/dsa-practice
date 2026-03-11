package _04_sliding_window;

public class MaximumSubarraySizeK {
	public static void main(String[] args) {
		solve(new int[] {2, 1, 5, 1, 3, 2}, 3);
	}
	public static void solve(int[] nums,int k) {
		if(nums==null || nums.length==0 || k>nums.length)return;
		int n=nums.length,runningSum=0;
		for(int i=0;i<k;i++)runningSum+=nums[i];
		int res=runningSum;
		for(int i=k;i<n;i++) {
			runningSum=runningSum-nums[i-k]+nums[i];
			res=Math.max(res, runningSum);
		}
		System.out.println(res);
	}
}
