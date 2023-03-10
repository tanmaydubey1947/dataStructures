package main.randomQuestions;

public class AddStars {
	
	public static String addStars(String s) {

		if(s.length() == 0 || s.length() == 1) {
			return s;
		}
		
		if(s.charAt(0) == s.charAt(1)) {
			
			String str = Character.toString(s.charAt(0)) + "*";
			return str + addStars(s.substring(1));
		} else {
			
			return Character.toString(s.charAt(0))+addStars(s.substring(1));
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(addStars("hello"));
		
	}

}
