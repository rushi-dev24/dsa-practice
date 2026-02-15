package _01_array_traversal;

public class EvensOdds {
	public static void evenOdds(int[] nums) {
		if(nums==null || nums.length==0)return;
		int evens=0,odds=0;
		for(int i=0;i<nums.length;i++) {
			if((nums[i] & 1) ==0) {
				evens++;
			}else {
				odds++;
			}
		}
		System.out.println("No. of Evens are "+evens+" and Odds are"+odds);
	}
}
