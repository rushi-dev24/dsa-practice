package _01_array_traversal;

import java.util.Arrays;

public class LeftRotateArrayBy1 {
	public static void leftRotateArrayBy1(int[] nums) {
		if(nums==null || nums.length==0)return;
		int temp=nums[0];
		for(int i=1;i<nums.length;i++) {
			nums[i-1]=nums[i];
		}
		nums[nums.length-1]=temp;
		System.out.println(Arrays.toString(nums));
	}

}
