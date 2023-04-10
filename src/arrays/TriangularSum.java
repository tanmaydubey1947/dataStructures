package arrays;

public class TriangularSum {

    public static void main(String[] args) {

        System.out.println(triangularSum(new int[]{5}));
    }

    public static int triangularSum(int[] nums) {

        int arrSize = nums.length;

        while (arrSize > 0) {

            for (int i = 0; i < arrSize-1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            arrSize--;
        }

        return nums[0];

    }
}
