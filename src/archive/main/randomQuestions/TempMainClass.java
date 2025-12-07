package archive.main.randomQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TempMainClass {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader numOfCasesBr = new BufferedReader(new InputStreamReader(System.in));
		
		String str = numOfCasesBr.readLine();
		
		int numOfTestCases = Integer.parseInt(str);
		
		String str1 = numOfCasesBr.readLine();
		
		String [] stringArray = str1.split("\\s+");
		int [] a = new int [stringArray.length];
		for(int i = 0;i<a.length;i++) {
			
			a[i] = Integer.parseInt(stringArray[i]);
		}
		
		
		while(numOfTestCases!=0) {
			
			for(int i=0;i<a.length;i++) {
				
				int num = a[i];
				
				for(int j=1;j<=num;j++) {
					
					if(j%3==0 && j%5==0) {
						System.out.println("FizzBuzz");
					} else if(j%3==0) {
						System.out.println("Fizz");
					} else if(j%5==0) {
						System.out.println("Buzz");
					} else {
						System.out.println(j);
					}
				}
				
				numOfTestCases--;
			}
			
			
			
		}
	}

}
