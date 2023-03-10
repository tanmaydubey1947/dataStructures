package main.randomQuestions;

public class CheckNumInArray {
	
	
	public static boolean checkNumber(int input[], int x) {
		
		if(input.length == 1 && x != input[0]) {
			
			return false;
		}
		
		if(x == input[0]) {
			
			return true;
			
		} else {

			int modifiedInput[] = new int[input.length - 1];

			for (int i = 1; i < input.length; i++) {

				modifiedInput[i - 1] = input[i];
			}  
			
			return checkNumber(modifiedInput, x);
		}
		
	}

	public static void main(String[] args) {
		
		int arr[] = new int[]{1,4,3,2,5};
		
		int x = 6;
		
		System.out.println(checkNumber(arr, x));
		
	}
}
