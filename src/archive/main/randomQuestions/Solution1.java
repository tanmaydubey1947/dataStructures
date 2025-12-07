package archive.main.randomQuestions;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	
	
	public static void main(String[] args) throws Exception {
		
		
		int element = 5;
		
		List<Integer> arr = new ArrayList<>();
		
		for(int i = 0;i<Math.pow(10, 5);i++) {
			
			arr.add(i+1);
		}
		
		
		int flag = 0;
		int counter = 1;
		
		while(flag!=1) {
			
			for(int i = 0;i<arr.size();i++) {
				
				arr.remove(counter+1);
				
			}
			
			counter++;
			
			for(int j = 0;j<arr.size();j++) {
				
				if(element == arr.get(j)) {
					flag = 1;
				}
			}
			
		}
		
		System.out.println(flag);
	}

}
