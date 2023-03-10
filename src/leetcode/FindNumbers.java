package leetcode;

public class FindNumbers {
	
	public static void main(String[] args) {
		
		System.out.println(findNumbers(new int[] {12,345,2,6,7896}));
		
	}
	
	public static int findNumbers(int[] nums) {
		int result = 0;
		
		for(int i = 0;i<nums.length;i++) {
			
			if(numberOfDigits(nums[i])%2==0) {
				result++;
			}
		}
		return result;
	}
	
	public static int numberOfDigits(int num) {
		String strNum = String.valueOf(num);
		return strNum.length();
	}

}
