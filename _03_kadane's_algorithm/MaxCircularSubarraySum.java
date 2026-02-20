import java.util.*;

public class MaxCircularSubarraySum{
    public static void solve(int[] nums){
        if(nums==null || nums.length==0) return;
        int total=0,maxKadane=Integer.MIN_VALUE,minKadane=Integer.MAX_VALUE,circularSum=Integer.MIN_VALUE,currMaxSum=0,currMinSum=0,n=nums.length;
        for(int i=0;i<n;i++){
            total+=nums[i];
            currMaxSum=Math.max(nums[i],currMaxSum+nums[i]);
            maxKadane=Math.max(maxKadane,currMaxSum);
            currMinSum=Math.min(nums[i],currMinSum+nums[i]);
            minKadane=Math.min(minKadane,currMinSum);
        }
        if(maxKadane<0){
            System.out.print(maxKadane);
            return;
        }
        circularSum=total-minKadane;
        System.out.println(Math.max(circularSum,maxKadane));
    }
}
