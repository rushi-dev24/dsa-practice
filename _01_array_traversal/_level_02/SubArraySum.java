package _01_array_traversal._level_02;

public class SubArraySum {
	public static void subArraySum(int[] nums,int target) {
		if(nums==null || nums.length==0)return;
		int count,res=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i;j<nums.length;j++) {
				count=0;
				for(int k=i;k<=j;k++) {
					count+=nums[k];
				}
				if(target==count)res++;
			}
		}
		System.out.println(res);
	}
}
