package archive.main.recursion;

public class RemoveX {
	
	
	public static String removeX(String input){

		if(input.length() == 0) {
			return input;
		}
		
		if(input.charAt(0) == 'x' || input.charAt(0) == 'X') {
			
			String temp = removeX(input.substring(1));
			return temp;
		} else {
			
			return input.charAt(0)+removeX(input.substring(1));
		}
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(removeX("axxabxabxaxxab"));
	}

}
