package _01_array_traversal._level_03;

import java.util.Arrays;

public class RightRotate {
	public static void rightRotateByK(int[] nums,int currSize,int k) {
		if(nums==null || nums.length==0)return;
		for(int i=1;i<=k;i++) {
			int temp=nums[currSize-1];
			for(int j=currSize-1;j>0;j--) {
				nums[j]=nums[j-1];
			}
			nums[0]=temp;
		}
		System.out.println(Arrays.toString(nums));
	}
}
