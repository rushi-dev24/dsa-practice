public class MaximumSubarraySum{
    public int maximumSubarraySum(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int n=nums.length,globalSum=Integer.MIN_VALUE,currentSum=0;
        for(int i=0;i<n;i++){
            currentSum=Math.max(currentSum+nums[i],nums[i]);
            /*
            OR
            currentSum+=nums[i];
            */
            globalSum=Math.max(globalSum,currentSum);
            /*
            if(currentSum<0)currentSum=0;
            */
        }
        return globalSum;
    }
}
