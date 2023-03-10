package main.recursion;

public class CheckStringPalindrome {
	
	static String str = "";
	static int temp = 0;
	
	public static boolean isStringPalindrome(String input) {

		if(input.length() == temp) {
			
			if(input.equals(str)) {
				return true;
			} else 
				return false;
		} else {
			
			str = str + input.charAt(input.length()- temp-1);
			temp++;
			return isStringPalindrome(input);
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(isStringPalindrome("abccba"));
		
	}

}
