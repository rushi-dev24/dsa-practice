package _01_array_traversal._level_02;

public class MajorityElement {
	public static void majorityElement(int[] nums) {
		if(nums==null || nums.length==0)return;
		int threshold=nums.length/2,curr,count;
		for(int i=0;i<nums.length;i++) {
			curr=nums[i];
			count=0;
			for(int j=0;j<nums.length;j++) {
				if(curr==nums[j]) {
					count++;
				}
			}
			if(count>threshold) {
				System.out.println(nums[i]);
				return;
			}
		}
	}
}
