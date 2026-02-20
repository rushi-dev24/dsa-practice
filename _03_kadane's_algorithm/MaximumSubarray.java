import java.util.*;

public class MaximumSubarray{
    public void maxSubarrayWithIndices(int[] nums){
        if(nums==null || nums.length==0)return;
        int start=0,end=0,tempStart=0,globalSum=Integer.MIN_VALUE,currSum=0;
        for(int i=0;i<nums.length;i++){
            if(currSum+nums[i]<nums[i]){
                tempStart=i;
                currSum=nums[i];
            }else{
                currSum+=nums[i];
            }
            if(globalSum<currSum){
                start=tempStart;
                end=i;
                globalSum=currSum;
            }
        }
        System.out.println("MaxSum: " + globalSum);
        System.out.println("Start: " + start);
        System.out.println("End: " + end);
        System.out.println("Subarray: " +
                Arrays.toString(Arrays.copyOfRange(nums, start, end + 1)));
    }
    // public static void main (String[] args) {
    //     new MaximumSubarray().maxSubarrayWithIndices(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    // }
}
