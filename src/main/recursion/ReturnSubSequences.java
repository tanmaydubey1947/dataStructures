package main.recursion;

public class ReturnSubSequences {
	
	public static String[] subSequences(String str) {
		
		if(str.length()==0) {
			
			return new String[] {""};
		} else {
		
		String smallAns[] = subSequences(str.substring(1));
		
		String[] ans = new String[smallAns.length*2];
		
		int k = 0;

		for(int i = 0;i<smallAns.length;i++) {
			
			ans[i] = smallAns[i];
			k++;
		}
		
		for(int i= 0;i<smallAns.length;i++) {
			
			ans[k] = ans[i]+ str.charAt(0);
			k++;
		}
		
		return ans;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		String [] ans = subSequences("abcdefghijkl");
		
		for(int i = 0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
		
	}

}
