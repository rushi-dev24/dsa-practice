package _01_array_traversal._level_03;

import java.util.Arrays;

public class SwapTwoSegments {
	public static void swapTwoSegments(int[] nums,int k) {
		for(int i=0;i<k/2;i++) {
			int temp=nums[i];
			nums[i]=nums[k-i-1];
			nums[k-i-1]=temp;
		}
		for(int i=k;i<(nums.length+k)/2;i++) {
			int temp=nums[i];
			nums[i]=nums[nums.length-1-i+k];
			nums[nums.length-1-i+k]=temp;
		}
		for(int i=0;i<nums.length/2;i++) {
			int temp=nums[i];
			nums[i]=nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(nums));
	}
}
