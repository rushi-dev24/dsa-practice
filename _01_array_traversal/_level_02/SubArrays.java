package _01_array_traversal._level_02;

public class SubArrays {
	public static void subArrayPrint(int[] nums) {
		if(nums==null || nums.length==0)return;
		for(int i=0;i<nums.length;i++) {
			for(int j=i;j<nums.length;j++) {
				System.out.print("[");
				for(int k=i;k<=j;k++) {
					System.out.print(nums[k]);
					if(k!=j)
						System.out.print(",");
				}
				System.out.println("]");
			}
		}
	}
}
