package _02_prefix_sum;

public class CountPosNegNums {
	public static void countPosAndNeg(int[] nums,int l,int r) {
		if(nums==null || nums.length==0 || l>r || l<0 || r>nums.length-1)return;
		int posPrefix[]=new int[nums.length];
		int negPrefix[]=new int[nums.length];
		int posCount=0,negCount=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<0) negCount++;
			else if(nums[i]>0) posCount++;
			posPrefix[i]=posCount;
			negPrefix[i]=negCount;
		}
		if(l==0) {
			System.out.println("Positives: "+posPrefix[r]+" Negatives"+negPrefix[r]);
		}else {
			System.out.println("Positives: "+(posPrefix[r]-posPrefix[l-1])+" Negatives"+(negPrefix[r]-negPrefix[l-1]));
		}
	}
}

