package _01_array_traversal._level_02;

public class CountPairs {
	public static void countPairs(int[] nums,int target) {
		if(nums==null || nums.length<2)return;
		int count=0;
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(target==nums[i]+nums[j]) count++;
			}
		}
		System.out.println(count);
	}
}
