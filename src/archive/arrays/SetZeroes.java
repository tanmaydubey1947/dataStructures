package archive.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetZeroes {

    /**
     * Leetcode Link : <a href="https://leetcode.com/problems/set-matrix-zeroes/description/">...</a>
     * <p>
     * Iteration for better approach : 1
     * </p>
     * Create a hashmap which will have key as integer and values will be a two size list. The list will basically contain
     * two items ith and jth index of array, but only if the value at arr[i][j] == 0. Once we have the hashmap ready. We are
     * sure about the indexes where we need to update the values with 0. For that we need to run two loops but independently.
     * The first loop will make the rows zero, in that we need to keep the row value as fixed but column value will keep
     * changing. Similarly, when we are dealing with a column, row value will keep changing anc column value will be fixed.
     * The row and column value we are fetching from the hashmap we have prepared.
     * <p>
     *
     * <p>
     * Time Complexity : O(n^2)
     * </p>
     */

    public static void main(String[] args) {
        int[][] arr = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

        setZeroes(arr);
    }

    public static void setZeroes(int[][] matrix) {

        Map<Integer, List<Integer>> zeroIndexes = new HashMap<>();
        int tempKey = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == 0) {
                    List<Integer> tempArrayList = new ArrayList<>();
                    tempArrayList.add(i);
                    tempArrayList.add(j);
                    zeroIndexes.put(tempKey, tempArrayList);
                    tempKey++;
                }
            }
        }

        for (int i = 0; i < zeroIndexes.size(); i++) {
            List<Integer> tempArrayList = zeroIndexes.get(i);

            for (int k = 0; k < matrix[i].length; k++) {
                matrix[tempArrayList.get(0)][k] = 0;
            }

            for (int k = 0; k < matrix[zeroIndexes.get(i).get(0)].length; k++) {
                matrix[k][tempArrayList.get(1)] = 0;
            }
        }

    }
}
