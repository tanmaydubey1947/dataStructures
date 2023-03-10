package main.recursion;

public class LastOccurrence {

	static int index = 0;

	public static int lastIndex(int input[], int x) {

		int index = 0;
		
		int modifiedArr[] = new int[input.length];
		
		for(int i = 0;i<input.length;i++) {
			
			modifiedArr[i] = input[(input.length-1)-i];
		}

		index = lastIndex(modifiedArr, x, 0);

		return index > -1 ? input.length - index -1 : index;
	}

	public static int lastIndex(int input[], int x, int range) {

		if (input.length == 1 && x != input[input.length - 1]) {

			return -1;
		}

		if (x == input[0]) {

			return index;
		} else {

			index++;

			int modifiedInput[] = new int[input.length - 1];

			for (int i = 1; i < input.length; i++) {

				modifiedInput[i - 1] = input[i];
			}

			return lastIndex(modifiedInput, x, range++);
		}

	}

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 4, 3, 1, 6 };

		int x = 9;

		System.out.println(lastIndex(arr, x));
	}

}
