package archive.main.recursion;

public class RemoveConsecutiveDuplicate {

	public static String removeConsecutiveDuplicates(String s) {
		
		
		if(s.length() == 0 || s.length() ==1) {
			return s;
		}
		
		if(s.charAt(0) == s.charAt(1)) {
			
			String temp = Character.toString(s.charAt(1)) + s.substring(2);
			
			return removeConsecutiveDuplicates(temp);
		}
		
		else {
			
			return Character.toString(s.charAt(0)) + removeConsecutiveDuplicates(s.substring(1));
		}

	}

	public static void main(String[] args) {
		
		System.out.println(removeConsecutiveDuplicates("aabccba"));

	}

}
