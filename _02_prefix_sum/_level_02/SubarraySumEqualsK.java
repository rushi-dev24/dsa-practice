package _02_prefix_sum._level_02;

public class SubarraySumEqualsK {
	private int[] nums=null;
	private int[] prefixSum=null;
	public SubarraySumEqualsK(int[] nums) {
		this.nums=nums;
		prefixSum=new int[nums.length];
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			prefixSum[i]=sum;
		}
	}
	public void solve(int target) {
		if(nums == null || nums.length==0)return;
		int countpairs=0;
		
		for(int i=0;i<prefixSum.length;i++) {
			
			if(prefixSum[i] == target) {
				countpairs++;
			}
			
			for(int j=0;j<i;j++) {
				if(prefixSum[i]-prefixSum[j]==target) {
					countpairs++;
				}
			}
		}
		System.out.println(countpairs);
	}
}
