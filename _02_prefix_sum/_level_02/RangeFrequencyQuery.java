package _02_prefix_sum._level_02;

public class RangeFrequencyQuery {
	private int[] nums=null;
	private int prefixSum[][]=null;
	public RangeFrequencyQuery(int[] nums) {
		this.nums=nums;
		prefixSum=new int[100][nums.length];
		for(int i=0;i<100;i++) {
			int count=0;
			for(int j=0;j<nums.length;j++) {
				if(nums[j]==i+1) count++;
				prefixSum[i][j]=count;
			}
		}
	}
	public void solve(int l,int r,int x) {
		if(nums==null || nums.length==0 ||l<0 || r>=nums.length || l>r || x<1 || x>100) return;
		if(l==0) {
			System.out.println(prefixSum[x-1][r]);
		}else {
			System.out.println(prefixSum[x-1][r]-prefixSum[x-1][l-1]);
		}
	}
}
