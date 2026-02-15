package _02_prefix_sum;

public class NumberOfOdds {
	public static void numberOfOdds(int[] nums,int l,int r) {
		if(nums==null || nums.length==0 || l<0 || r>=nums.length || l>r) return;
		int prefix[]=new int[nums.length],count=0;
		for(int i=0;i<nums.length;i++) {
			if((nums[i]&1)==1) {
				count++;
			}
			prefix[i]=count;
		}
		if(l==0)System.out.println(prefix[r]);
		else System.out.println(prefix[r]-prefix[l-1]);
		
	}
}
