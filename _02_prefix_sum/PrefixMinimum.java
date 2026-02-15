package _02_prefix_sum;

import java.util.Arrays;

public class PrefixMinimum {
	public static void prefixMin(int[]  nums) {
		if(nums==null || nums.length==0)return;
		int min=nums[0];
		int[] prefixMin=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			min=Math.min(min, nums[i]);
			prefixMin[i]=min;
		}
		System.out.println(Arrays.toString(prefixMin));
	}
}
