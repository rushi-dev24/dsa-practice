package _02_prefix_sum._level_02;

public class TotalSumOfAllSubarrays {
	private int[] nums=null;
	public TotalSumOfAllSubarrays(int[] nums) {
		this.nums=nums;
	}
	public void solve() {
		if(nums == null || nums.length==0) return;
		long res=0;
		//Using Prefix Sum - Time complexity = O(N^2)
		for(int i=0;i<nums.length;i++) {
			long tempPrefixSum=0;
			for(int j=i;j<nums.length;j++) {
				tempPrefixSum+=nums[j];
				res+=tempPrefixSum;
			}
		}
    /*
    Optimal Way - Time complexity = O(N)
		for(int i=0;i<nums.length;i++) {
			res=res+(long)nums[i]*(nums.length-i)*(i+1);
		}
    */
		System.out.println(res);
	}
}
