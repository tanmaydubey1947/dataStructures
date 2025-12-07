package archive.main.recursion;

import java.util.Scanner;

public class QuickSortAlgorithm {
	
	public static void quickSort(int[] input) {

		int startIndex = 0;
		int endIndex = input.length-1;
		
		quickSort(input, startIndex, endIndex);
		
	}
	
	public static void quickSort(int input[], int startIndex, int endIndex) {
		
		if(startIndex>=endIndex) {
			return;
		} else {
			
			int pivotPos = partition(input, startIndex, endIndex);
			quickSort(input, startIndex, pivotPos-1);
			quickSort(input, pivotPos+1, endIndex);
		}
	}
	
	public static int partition(int input[], int startIndex, int endIndex) {

		int pivotElement = input[startIndex];

		int countSmallerThanPivot = 0;

		for (int i = startIndex + 1; i < input.length; i++) {

			if (pivotElement >= input[i]) {
				countSmallerThanPivot++;
			}
		}

		int pivotPos = countSmallerThanPivot + startIndex;

		int temp = input[startIndex];
		input[startIndex] = input[pivotPos];
		input[pivotPos] = temp;

		int i = startIndex;
		int j = endIndex;

		while (i < pivotPos && pivotPos < j) {

			if (input[i] > pivotElement) {

				temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				
				j--;
			} else if (input[i] <= pivotElement) {

				i++;
			}
		}

		return pivotPos;
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		 
		int size = s.nextInt();
		
		
		
		int input[] = new int[size];
		
		for(int i = 0;i<size;i++) {
			input[i] = s.nextInt();
		}
		
		quickSort(input);
		
		for(int i = 0;i<input.length;i++) {
			
			System.out.println(input[i]);
		}
		
		s.close();
		
	}

	
}
