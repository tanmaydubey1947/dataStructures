package main.recursion;

public class BinarySearchAlgo {

	public static int binarySearch(int[] input, int element) {

		int start = 0;
		int end = input.length-1;

		int ansIndex = binarySearch(input, element, start, end);

		return ansIndex;

	}

	private static int binarySearch(int arr[], int x, int start, int end) {

		int mid = (start + end) / 2;

		if (start > end) {

			return -1;
		}

		if (arr[mid] == x) {
			return mid;
		} else if (arr[mid] > x) {

			return binarySearch(arr, x, start, mid - 1);
		} else {

			return binarySearch(arr, x, mid + 1, end);
		} 

	}

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };

		System.out.println(binarySearch(arr, 5));
	}

}
