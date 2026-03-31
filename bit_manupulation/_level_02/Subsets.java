package bit_manupulation._level_02;

import java.util.*;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		int n=nums.length;
		List<List<Integer>> res=new ArrayList<>();
		for(int i=0;i<(1<<n);i++) {
			int curr=i;
			List<Integer> temp=new ArrayList<Integer>();
			for(int num:nums) {
				if((curr & 1)==1) {
					temp.add(num);
				}
				curr>>=1;
			}
			res.add(temp);
		}
	    return res;
	}
}
