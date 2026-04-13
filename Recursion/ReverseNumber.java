package Recursion;

public class ReverseNumber {
	int rev=0;
	int reverse(int n) {
		if(n==0)return rev;
		rev=rev*10+(n%10);
		return reverse(n/10);
	}
}
