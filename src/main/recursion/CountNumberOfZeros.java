package main.recursion;

import java.util.Scanner;

public class CountNumberOfZeros {
	
	
	public static int countZerosRec(int input) {
		
		
		if(input  == 0) {
			return 1;
		} else {
			
			return countZerosHelper(input);
		}
		
		
	
	}
	
	public static int countZerosHelper(int input) {

		if (input == 0) {
			return 0;
		}

		if (input % 10 == 0) {

			return 1 + countZerosHelper(input / 10);
		} else {

			return countZerosHelper(input / 10);
		}

	}
	
	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countZerosRec(n));
		s.close();
	}

}