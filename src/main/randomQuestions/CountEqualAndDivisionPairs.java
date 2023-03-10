package main.randomQuestions;

public class CountEqualAndDivisionPairs {

	public static void main(String[] args) {

		int arr[] = new int[] { 5, 5, 9, 2, 5, 5, 9, 2, 2, 5, 5, 6, 2, 2, 5, 2, 5, 4, 3 };
		int k = 7;

		System.out.println(countPairs(arr, k));

	}

	public static int countPairs(int[] nums, int k) {

		int count = 0;

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {

					if (((i * j) % k) == 0) {
						count++;
					}
				}
			}
		}

		return count;
	}

}
