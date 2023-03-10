package main.recursion;

public class FirstOccurrence {
	
	static int index = 0;
	
	public static int firstIndex(int input[], int x) {
		
		return firstIndex(input,x,0);
	}
	
	public static int firstIndex(int input[], int x, int range) {
		

		if(input.length == 1 && x != input[input.length-1]){
			
			return -1;
		} 
		
		if(x == input[0]) {
			
			return index;
		} else {
			
			index++;
			
			int modifiedInput[] = new int[input.length - 1];

			for (int i = 1; i < input.length; i++) {

				modifiedInput[i - 1] = input[i];
			}  
			
			return firstIndex(modifiedInput, x, range++);
		}
		
	
		
	}
	
	public static void main(String[] args) {
		
	int arr[] = new int[]{1,4,3,2,6};
		
		int x = 1;
		
		System.out.println(firstIndex(arr, x));
	}

}
