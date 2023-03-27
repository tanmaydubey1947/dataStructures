package strings;

public class RemoveOccurences {

	public static void main(String[] args) {

		System.out.println(removeOccurrences("aabababa", "aba"));

	}

	public static String removeOccurrences(String s, String part) {

		while(true) {
			
			if(s.contains(part)) {
				s = removeSequence(s, part);
			} else {
				break;
			}
		}

		return s;

	}

	private static String removeSequence(String inputStr, String sequence) {
		return inputStr.replaceFirst(sequence, "");

	}

}