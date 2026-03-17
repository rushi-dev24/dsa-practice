package bit_manupulation;

public class IsIthBitSet {
	public boolean isIthBitSet(int n, int i) {
		n=n >> i;
		return (n & 1) == 1;
		//or	return (n&(1<<i))!=0;
	}
}
