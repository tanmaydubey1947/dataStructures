package archive.leetcode;

public class DifferenceOfSum {
	
	public static void main(String[] args) {
		
		System.out.println(differenceOfSum(new int[] {1,15,6,3}));
		
	}
	
	public static int differenceOfSum(int[] nums) {
		
		int arraySum = 0, digitSum  = 0;
		
		for(int i : nums) {
			arraySum = arraySum + i;
			digitSum = digitSum + getSumOfDigits(i);
		}
		return arraySum - digitSum;
	}
	
	public static int getSumOfDigits(int num) {
		
		if((""+num).length() == 1) {
			return num;
		}
		
		int sumOfDigits = 0;
		
		while(num!=0) {
			sumOfDigits = sumOfDigits + num%10;
			num = num /10;
		}
		
		return sumOfDigits;
		
	}

}
