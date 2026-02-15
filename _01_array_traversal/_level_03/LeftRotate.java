package _01_array_traversal._level_03;

import java.util.Arrays;

public class LeftRotate {
	public static void leftRotateByK(int[] nums,int currSize,int k) {
		if(nums==null || nums.length==0)return;
		for(int i=1;i<=k;i++) {
			int temp=nums[0];
			for(int j=0;j<currSize-1;j++) {
				nums[j]=nums[j+1];
			}
			nums[currSize-1]=temp;
		}
		System.out.println(Arrays.toString(nums));
	}
}
