package _01_array_traversal._level_02;

public class LongestIncreasingSubArray {
	public static void longestIncreasingSubArray(int[] nums) {
		if(nums==null || nums.length==0)return;
		int length=1,res=1;
		for(int i=0;i<nums.length-1;i++) {
			length=1;
			for(int j=i;j<nums.length-1;j++) {
				if(nums[j]<nums[j+1]){
					length++;
				}else {
					break;
				}
			}
			res=Math.max(res, length);
		}
		System.out.println(res);
	}
}
