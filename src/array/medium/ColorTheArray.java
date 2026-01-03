package array.medium;

public class ColorTheArray {
    public int[] colorTheArray(int n, int[][] queries) {

        int[] ans = new int[queries.length];
        int[] nums = new int[n];
        int curAns = 0;

        for (int i = 0; i < queries.length; i++) {

            int index = queries[i][0];
            int color = queries[i][1];

            int preColor = (index > 0) ? nums[index - 1] : 0;
            int nextColor = (index < n - 1) ? nums[index + 1] : 0;

            if (nums[index] != 0 && preColor == nums[index]) {
                curAns--;
            }

            if (nums[index] != 0 && nextColor == nums[index]) {
                curAns--;
            }

            nums[index] = color;

            if (nums[index] == preColor) {
                curAns++;
            }

            if (nums[index] == nextColor) {
                curAns++;
            }

            ans[i] = curAns;
        }

        return ans;
    }
}