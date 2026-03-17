package bit_manupulation;

public class CheckEvenOdd {
	public String checkEvenOdd(int n) {
		if((n & 1) == 0)return "Even";
		else return "Odd";
	}
}
