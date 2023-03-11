package sortingAlgorithms;

public class SelectionSort {

	/**
	 * Step 1 - Get the minimum from the array and swap the first element
	 * 
	 * Step 2 -Now the first element is already sorted so search the minimum from next index
	 * 
	 * Step 3 - In the first two iteration we have got two elements sorted, again from the next index keep repeating the steps 
	 * 
	 * Step 4 - Now we have three elements sorted keep repeating the steps until we reach the last element
	 * 
	 * So the approach is get the minimum and swap it.
	 * 
	 * Iterations will go as follows :
	 * 
	 * Find minimum between 0 to n-1 and swap with index 0 Find minimum between 1 to
	 * n-1 and swap with index 1 Find minimum between 2 to n-2 and swap with index 2
	 * 
	 * This will keep on repeating until the second last element because the last
	 * element need not to be sorted as it is the max element
	 * 
	 * Time Complexity : O(n^2)
	 * 
	 */

	public static void main(String[] args) {

		int arr[] = selectionSortAlgo(new int[] { 5, 4, 3, 2, 1 });
		
		for(int num : arr) {
			System.out.println(num);
		}

	}

	private static int[] selectionSortAlgo(int arr[]) {

		for (int i = 0; i <= arr.length - 2; i++) {
			int minIndex = i;
			for (int j = i; j <= arr.length - 1; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}

			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}

		return arr;
	}
}
