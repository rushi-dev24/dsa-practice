package _02_prefix_sum._level_02;

public class ValueRangeCountQuery {
	
	private int[] nums=null;
	private int[] count=null;
	private int[] prefixCount=null;
	
	public ValueRangeCountQuery(int[] nums) {
		this.nums=nums;
		count=new int[101];
		for(int i=0;i<nums.length;i++) {
			count[nums[i]]++;
		}
		prefixCount=new int[101];
		int sum=0;
		for(int i=1;i<101;i++) {
			sum+=count[i];
			prefixCount[i]=sum;
		}
	}
	public void solve(int l,int r) {
		if(nums==null || nums.length==0 || l<1 || r>100 || l>r)return;
		System.out.println(prefixCount[r]-prefixCount[l-1]);
	}
}
