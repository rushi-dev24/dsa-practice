package _01_array_traversal._level_02;

public class CheckDuplicates {
	public static void checkDuplicates(int[] nums) {
		if(nums==null || nums.length==0)return;
		if(nums.length==1) {
			System.out.println("No");
			return;
		}
		boolean hadDuplicates=false;
		int curr;
		for(int i=0;i<nums.length-1;i++) {
			curr=nums[i];
			for(int j=i+1;j<nums.length;j++) {
				if(curr==nums[j]) {
					hadDuplicates=true;
					break;
				}
			}
			if(hadDuplicates) {
				break;
			}
		}
		if(hadDuplicates)System.out.println("Yes");
		else System.out.println("No");
	}

}
