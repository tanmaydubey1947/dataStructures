package archive.main.recursion;

import java.util.Scanner;

public class MergeSortAlgorithm {

	public static void mergeSort(int[] input) {

		int start = 0;
		int end = input.length - 1;

		callMergeSort(input, start, end);

	}

	public static void callMergeSort(int[] input, int start, int end) {

		if (start >= end) {
			return;
		}

		int mid = (start + end) / 2;

		callMergeSort(input, start, mid);
		callMergeSort(input, mid + 1, end);

		mergeElements(input, start, end);
	}

	public static void mergeElements(int[] input, int startIndex, int endIndex) {
		
		// Find sizes of two subarrays to be merged
		
		int m = (startIndex+endIndex)/2;
		
        int n1 = m - startIndex + 1;
        int n2 = endIndex - m;
 
        /* Create temp archive.arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp archive.arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = input[startIndex + i];
        for (int j = 0; j < n2; ++j)
            R[j] = input[m + 1 + j];
 
        /* Merge the temp archive.arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = startIndex;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                input[k] = L[i];
                i++;
            }
            else {
                input[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            input[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            input[k] = R[j];
            j++;
            k++;
        }
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void printArray(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] input = new int[] { 5, 4, 3, 2, 1 };
		mergeSort(input);
		printArray(input);
	}
}
