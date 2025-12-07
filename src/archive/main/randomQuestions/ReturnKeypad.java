package archive.main.randomQuestions;

public class ReturnKeypad {
	
	
	static String [] keypadValues = new String[] {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	
	public static String[] returnKeypad(int n) {

		if (n == 0) {
			return new String[] { "" };
		} else {

			String smallAns[] = returnKeypad(n / 10);

			int num = n % 10;

			String tempValues = keypadValues[num - 2];

			String ans[] = new String[smallAns.length * 3];

			for (int i = 0; i < smallAns.length; i++) {

				ans[i] = smallAns[i];
			}

			int k = 0;
			for (int i = 0; i < ans.length; i++) {

				ans[i] = ans[i] + tempValues.charAt(k);
				k++;
				if (k == 3) {
					k = 0;
				}
			}

			return ans;
		}
	}
	
	
	public static void main(String[] args) {
		
		
		String str [] = returnKeypad(23);
		
		for(int i = 0;i<str.length;i++) {
			
			System.out.println(str[i]);
		}
	}

}
