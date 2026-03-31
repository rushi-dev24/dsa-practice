package bit_manupulation;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		int n=nums.length,total=0,curr=0;
		for(int i=0;i<=n;i++) {
			total^=i;
		}
		for(int i:nums) {
			curr^=i;
		}
		return (total^curr);
	}
}
