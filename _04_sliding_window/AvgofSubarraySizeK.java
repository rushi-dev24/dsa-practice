package _04_sliding_window;

public class AvgofSubarraySizeK {
	public static void main(String[] args) {
		solve(new int[] {1, 3, 2, 6, -1, 4, 1, 8, 2}, 5);
	}
	public static void solve(int[] nums,int k) {
		if(nums == null || nums.length==0 || k>nums.length)return;
		int n=nums.length,runningSum=0;
		for(int i=0;i<k;i++)runningSum+=nums[i];
		for(int i=k;i<n;i++) {
			System.out.println((float)runningSum/k);
			runningSum=runningSum-nums[i-k]+nums[i];
		}
		System.out.println((float)runningSum/k);
	}

}
