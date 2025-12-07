package archive.main.recursion;

public class ReplaceWithPI {

	public static String replace(String input) {

		if (input.length() == 0 || input.length() == 1) {

			return input;
		}

		if (input.charAt(0) == 'p' && input.charAt(1) == 'i') {

			String temp = "3.14" + replace(input.substring(2));
			return temp;
		} else {

			return input.charAt(0)+(replace(input.substring(1)));
		}
	}

	public static void main(String[] args) {

		String str = "pip";

		System.out.println(replace(str));
		
		
//		String temp = "3.14";
//		System.out.println(temp.charAt(1));

	}

}
