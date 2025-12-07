package archive.main.randomQuestions;

public class SumOfArray {
	
	public static int sum (int input[]){
		
		if(input.length ==1) {
			
			return input[0];
		} 
		
		int modifiedInput[] = new int[input.length-1];
		
		for(int i = 1;i<input.length;i++) {
			
			modifiedInput[i-1] = input[i];
		}
		
		return input[0] + sum(modifiedInput);
	}
	
	

	public static void main(String[] args) {
		
		int arr[] = new int[]{5};
		
		System.out.println(sum(arr));
		

	}

}
