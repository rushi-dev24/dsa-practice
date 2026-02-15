package _01_array_traversal._level_02;

public class RemoveDuplicates {
	public static void removeDuplicates(int[] nums) {
		if(nums==null || nums.length==0)return;
		for(int i=0;i<nums.length;i++) {
			boolean isAppeared=false;
			int curr=nums[i];
			for(int j=0;j<i;j++) {
				if(nums[j]==curr) {
					isAppeared=true;
					break;
				}
			}
			if(isAppeared) continue;
			else System.out.println(curr);
		}
	}
}
