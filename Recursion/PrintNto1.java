package Recursion;

public class PrintNto1 {
	void print(int n) {
		if(n<=0)return;
		System.out.println(n);
		print(n-1);
	}
}
