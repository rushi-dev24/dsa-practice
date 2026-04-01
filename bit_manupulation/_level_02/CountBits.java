package bit_manupulation._level_02;

public class CountBits {
	public int[] countBits(int n) {
		int[] setBits=new int[n+1];
		for(int i=0;i<=n;i++) {
			setBits[i]=getBits(i);
		}
		return setBits;
	}
	public int getBits(int n) {
		int count=0;
		while(n>0) {
			count++;
			n&=(n-1);
		}
		return count;
	}
}
