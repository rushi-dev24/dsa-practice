package Recursion;

public class ParlindromeCheck {
	boolean isParlindrome(String s) {
		if(s.length() == 0 || s.length() == 1)return true;
		if(s.charAt(0) != s.charAt(s.length()-1))return false;
		return isParlindrome(s.substring(1, s.length()-1));
	}
}
