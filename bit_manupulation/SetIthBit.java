package bit_manupulation;

public class SetIthBit {
	public int setIthBit(int n, int i) {
		return (n | (1<<i));
	}
}
