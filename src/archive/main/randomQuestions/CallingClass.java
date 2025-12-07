package archive.main.randomQuestions;

public class CallingClass {

	public static void main(String[] args) {
		
		String s = "codeleet"; 
		int []indices = new int[] {4,5,6,7,0,2,1,3};
		
		RestoreString rs = new RestoreString();
		
		System.out.println(rs.restoreString(s, indices));
				
	}
}
