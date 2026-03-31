package bit_manupulation;

public class TwoSingleNumber {
	public int[] singleNumber(int[] nums) {
		int xor=0;
		for(int i:nums) {
			xor^=i;
		}
		int org=xor;
		xor=(xor&(xor-1))^org;
		int a=0,b=0;
		for(int i:nums) {
			if((i&xor)!= 0)a^=i;
			else b^=i;
		}
		return new int[]{a,b};
	}
}
