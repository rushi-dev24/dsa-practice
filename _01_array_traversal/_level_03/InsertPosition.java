package _01_array_traversal._level_03;

public class InsertPosition {
	public static void insertposition(int[] nums,int currSize,int element,int index) {
		if(nums==null || nums.length==0 || index<0 || index>currSize)return;
		for(int i=currSize;i>index;i--) {
			nums[i]=nums[i-1];
		}
		nums[index]=element;
	}
}
