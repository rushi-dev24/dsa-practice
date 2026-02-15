package _01_array_traversal._level_03;

import java.util.Arrays;

public class ManualShifting {
	public static void manualShifting(int[] nums) {
		if(nums==null || nums.length==0)return;
		for(int i=nums.length-1;i>0;i--) {
			nums[i]=nums[i-1];
		}
		nums[0]=0;
		System.out.println(Arrays.toString(nums));
	}
}
