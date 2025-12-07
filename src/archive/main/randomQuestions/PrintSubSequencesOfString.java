package archive.main.randomQuestions;

public class PrintSubSequencesOfString {

	public static void printSubSequences(String input) {

		printSubSequences(input, "");
	}

	public static void printSubSequences(String input, String outputTillNow) {

		if (input.length() == 0) {
			System.out.println(outputTillNow);
		} else {

			printSubSequences(input.substring(1), outputTillNow);
			printSubSequences(input.substring(1), outputTillNow + input.charAt(0));
		}

	}

	public static void main(String[] args) {

		printSubSequences("xyz");
	}

}