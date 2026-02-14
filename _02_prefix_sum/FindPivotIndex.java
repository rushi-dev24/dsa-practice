class Solution {
    public int pivotIndex(int[] nums) {
        if(nums==null || nums.length==0)return -1;
        if(nums.length==1) return 0;
        int sum=0,resIndex=-1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        int  i=0;
        for(i=0;i<nums.length-1;i++){
            if(i==0){
                if(sum-nums[i]==0){
                    return 0;
                }
            }
            if(sum-nums[i]==nums[i+1]){
                return i+1;
            }
        }
        return resIndex;
    }
}
