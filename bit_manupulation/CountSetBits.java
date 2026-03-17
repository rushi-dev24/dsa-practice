package bit_manupulation;

public class CountSetBits {
	public int countSetBits(int n) {
		int count=0;
		while(n>0) {
			count+=n&1;
			n>>=1;
		}
		return count;
		//or Using turning off right most set bit
		/*
		while(n!=0){
			n=n & (n-1);
			count++;
		}
		return count;
		*/
	}
}
