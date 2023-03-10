package main.randomQuestions;

public class Solution {

	public int getSmallestPositive(int[] A) {

		int maxValue = Integer.MAX_VALUE, minValue = Integer.MIN_VALUE;

		for (int i = 0; i < A.length; i++) {

			if (A[i] < maxValue) {
				maxValue = A[i];
			}
		}

		if (maxValue < 0) {
			return 1;
		}

		for (int i = 0; i < A.length; i++) {

			if (minValue < A[i]) {
				minValue = A[i];
			}
		}

		boolean isPresent = false;

		for (int i = 1; i < minValue; i++) {

			for (int j = 0; j < A.length; j++) {

				if (i == A[j]) {
					isPresent = true;
				}

			}

			if (isPresent) {
				isPresent = false;
			} else {
				return i;
			}
		}

		return minValue + 1;
	}

}
