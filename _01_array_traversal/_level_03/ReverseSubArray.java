package _01_array_traversal._level_03;

import java.util.Arrays;

public class ReverseSubArray {
	public static void reverseSubArray(int[] nums,int l,int r) {
		if(nums==null || nums.length==0 || l<0 || r>=nums.length || l>=r)return;
		for(int i=l;i<=(l+r)/2;i++) {
			int temp=nums[i];
			nums[i]=nums[l+r-i];
			nums[l+r-i]=temp;
		}
		System.out.println(Arrays.toString(nums));
	}
}
