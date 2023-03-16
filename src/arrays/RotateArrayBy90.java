package arrays;

public class RotateArrayBy90 {

    /**
     * Leetcode Link : <a href="https://leetcode.com/problems/rotate-image/description/">...</a>
     * <p>
     * Iteration for better approach : 1
     * </p>
     *       Copy the given array and then update the parameterized array. In order to update we need to follow a certain pattern, in order make the pattern we need to
     *       create two additional variables which will basically store the indexes on which we have to update the array.
     *
     *       [00, 01, 02]        [20, 10, 00]         We need to just observe this pattern
     *       [10, 11, 12]  ==>   [21, 11, 01]
     *       [20, 21, 22]        [22, 12, 02]
     * <p>
     *
     * <p>
     * Time Complexity : O(n^2)
     * </p>
     */

    public static void main(String[] args) {

        rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }


    public static void rotate(int[][] matrix) {

        int[][] newArr = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newArr[i][j] = matrix[i][j];
            }
        }

        int a = newArr.length - 1;
        int b = 0;

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {

                matrix[i][j] = newArr[a--][b];
            }
            a = newArr.length - 1;
            b++;
        }
    }
}
