package archive.leetcode;

public class MinOperationsBox {
	
	public static void main(String[] args) {
		
		String str = "001011";
		int [] result = minOperations(str);
		
		for(int i : result) {
			System.out.println(i);
		}
		
	}
	
	 public static int[] minOperations(String boxes) {
		 
		 int [] result = new int [boxes.length()];
		 
		 int minOperations = 0;
		 
			for (int i = 0; i < boxes.length(); i++) {

				for (int j = 0; j < boxes.length(); j++) {

					if (i == j) {
						continue;
					} else {

						if (boxes.charAt(j) == '1') {
							minOperations = minOperations + abs(i - j);
						}
					}

				}
				
				result[i] = minOperations;
				minOperations = 0;
		 }
		 
		 
		 
		 return result;
	        
	    }

	private static int abs(int i) {
		
		if(i>=0) {
			return i;
		} else {
			
			return i* (-1);
		}
	}

}
