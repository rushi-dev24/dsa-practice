class NumArray {
    int[] nums;

    public NumArray(int[] nums) {
        this.nums=nums;
        int sum=0;
        for(int i=0;i<this.nums.length;i++){
            sum+=this.nums[i];
            this.nums[i]=sum;
        }
    }
    
    public int sumRange(int left, int right) {
        // System.out.println(Arrays.toString(nums));
        if(left==0){
            return this.nums[right];
        }
        return this.nums[right]-this.nums[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
