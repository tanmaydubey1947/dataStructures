package archive.arrays;

/**
 * 
 * 
 * Leetcode Link : https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 * 
 * Iteration for better approach : 1
 * 
 * Approach:
 * 
 * Need to check archive.arrays from every index as they might be sorted from any index
 * Keep passing new array indexes and rotate it and get the result
 * Create a method which will keep on rotating the array
 * Once we have the result just compare first index with next if it is less, and keep a temp flag which will indicate if all
 *  the elements after rotation or with rotation it is sorted
 * 
 *  
 *
 */

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		
		System.out.println(check(new int[] {3,4,5,1,2})); // o/p : true
		System.out.println(check(new int[] {3,4,5,1,20})); // o/p : false

	}

	public static boolean check(int[] nums) {

		int temp = 0;
		for (int j = 0; j < nums.length; j++) {
			for (int i = 0; i < nums.length - 1; i++) {

				if (nums[i] > nums[i + 1]) {
					temp = 1;
					break;
				}
			}

			if (temp == 0) {
				return true;
			} else {
				nums = rotateArray(nums);
				temp = 0;
			}
		}

		return false;
	}

	private static int[] rotateArray(int[] arr) {
		int[] resultArr = new int[arr.length];

		resultArr[arr.length - 1] = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			resultArr[i] = arr[i + 1];
		}

		return resultArr;
	}

}
