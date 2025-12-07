package archive.main.randomQuestions;

public class Palindrome {

	public boolean isPalindrome(int x) {

		int x1 = x;
		int newNum = 0, temp = 0;

		if (x < 0) {
			return false;
		} else {

			while (x1 != 0) {

				temp = x1 % 10;
				newNum = newNum * 10 + temp;
				x1 = x1 / 10;
			}
		}

		if (x == newNum) {
			return true;
		} else {
			return false;
		}

	}
}
