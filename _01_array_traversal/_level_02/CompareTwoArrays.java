package _01_array_traversal._level_02;

public class CompareTwoArrays {
	public static void comparetwoArrays(int[] nums1,int[] nums2) {
		if(nums1==null || nums2==null || nums1.length==0 || nums2.length==0)return;
		if(nums1.length!=nums2.length) {
			System.out.println("No");
			return;
		}
		boolean areSame=true;
		int curr,count1=0,count2=0;
		for(int i=0;i<nums1.length;i++) {
			curr=nums1[i];
			boolean isAppeared=false;
			for(int m=0;m<i;m++) {
				if(nums1[m]==curr) {
					isAppeared=true;
				}
			}
			if(isAppeared) continue;
			for(int k=0;k<nums1.length;k++) {
				if(curr==nums1[k]) {
					count1++;
				}
			}
			for(int j=0;j<nums2.length;j++) {
				if(curr==nums2[j]) {
					count2++;
				}
			}
			if(count1!=count2) {
				areSame=false;
				break;
			}
			count1=0;
			count2=0;
		}
		if(areSame) System.out.println("Yes");
		else System.out.println("No");
	}

}
