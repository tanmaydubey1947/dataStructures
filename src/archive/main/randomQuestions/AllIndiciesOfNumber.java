package archive.main.randomQuestions;

import java.util.Scanner;

public class AllIndiciesOfNumber {

	public static int[] allIndexes(int input[], int x) {

		int result[] = new int[input.length];

		result = allIndicesOfNumber(input, x, 0, result, 0);

		int count = 0;

		if (input[0] == x) {
			count++;
		}

		for (int i = 0; i < result.length; i++) {

			if (result[i] != 0) {
				count++;
			}
		}

		int customizedResult[] = new int[count];
		
		int temp = 0;

		if (input[0] == x) {

			customizedResult[0] = 0;
			temp++;
			count--;

		}

		for (int i = 1; i < result.length; i++) {

			if(count<0) {
				break;
			}
			
			if (result[i] != 0) {

				customizedResult[temp++] = result[i];
				count--;
			}

		}

		return customizedResult;
	}

	public static int[] allIndicesOfNumber(int arr[], int x, int index, int result[], int resultIndex) {

		if (arr.length <= 0) {

			return result;
		}

		if (arr.length <= index) {

			return result;
		}

		if (arr[index] == x) {

			result[resultIndex] = index;
			return allIndicesOfNumber(arr, x, ++index, result, ++resultIndex);
		} else {

			return allIndicesOfNumber(arr, x, ++index, result, ++resultIndex);
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int size = s.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {

			arr[i] = s.nextInt();
		}

		int num = s.nextInt();

		System.out.println(allIndexes(arr, num));

	}

}