package bit_manupulation._level_02;

public class XorFrom1ToN {
	public int xorFrom1ToN(int n) {
		int mod=n%4;
		switch(mod) {
		case 0:
			return n;
		case 1:
			return 1;
		case 2:
			return n-1;
		}
		return 0;
	}
}
