package _02_prefix_sum;

public class CountDivisibleInRange {
	public static void countDivisible(int[] nums, int k, int l, int r){
		if(nums==null || nums.length==0 || l>r || l<0 || r>=nums.length)return;
		int count=0;
		int prefixDivisible[]=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%k == 0)count++;
			prefixDivisible[i]=count;
		}
		if(l==0)System.out.println(prefixDivisible[r]);
		else System.out.println(prefixDivisible[r]-prefixDivisible[l-1]);
	}
}
