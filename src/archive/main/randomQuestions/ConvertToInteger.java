package archive.main.randomQuestions;

import java.util.Scanner;

public class ConvertToInteger {

	public static int convertStringToInt(String input) {

		if (input.length() == 0) {
			return 0;
		} else {

			int num = Integer.valueOf(input.charAt(0));

			num = Integer.valueOf(input.charAt(0)) - 48;

			return (int) (num * Math.pow(10, input.length()-1) + convertStringToInt(input.substring(1)));
		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
	//	String str = s.nextLine();

		System.out.println(convertStringToInt("0000031402123"));

	}

}
