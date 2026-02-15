package _01_array_traversal;

public class ParlindromeCheck {
	public static void parlindromeCheck(int[] nums) {
		if(nums==null || nums.length==0) return;
		boolean isParlindrome=true;
		for(int i=0;i<nums.length/2;i++) {
			if(nums[i]!=nums[nums.length-i-1]) {
				isParlindrome=false;
				break;
			}
		}
		if(isParlindrome) System.out.println("Parlindrome");
		else System.out.println("Not a parlindrome");
	}
}
