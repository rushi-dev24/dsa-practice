package bit_manupulation;

public class ToggleIthBit {
	public int toggleIthBit(int n, int i) {
		return (n ^ (1<<i));
	}
}
