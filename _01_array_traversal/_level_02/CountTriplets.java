package _01_array_traversal._level_02;

public class CountTriplets {
	public static void countTriplets(int[] nums,int target) {
		if(nums==null || nums.length==0)return;
		int count=0;
		for(int i=0;i<nums.length-2;i++) {
			for(int j=i+1;j<nums.length-1;j++) {
				for(int k=j+1;k<nums.length;k++) {
					if(target==nums[i]+nums[j]+nums[k]) count++;
				}
			}
		}
		System.out.println(count);
	}
}
