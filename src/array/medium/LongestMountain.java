package array.medium;

public class LongestMountain {

    // TC: O(n) & SC: O(2n)
    public int betterSolution(int[] arr) {

        int n = arr.length;
        int[] up = new int[n];
        int[] down = new int[n];

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                up[i] = 1 + up[i - 1];
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                down[i] = 1 + down[i + 1];
            }
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (up[i] > 0 && down[i] > 0) {
                ans = Math.max(ans, up[i] + down[i] + 1);
            }
        }

        return ans;
    }

    // TC: O(n) & SC: O(1)
    public int optimalSolution(int[] arr) {

        int i = 1;
        int ans = 0;
        int n = arr.length;

        while (i < n) {

            while (i < n && arr[i] == arr[i - 1]) {
                i++;
            }

            int up = 0;
            while (i < n && arr[i] > arr[i - 1]) {
                up++;
                i++;
            }

            int down = 0;
            while (i < n && arr[i - 1] > arr[i]) {
                down++;
                i++;
            }

            if (up > 0 && down > 0) {
                ans = Math.max(ans, down + up + 1);
            }
        }

        return ans;
    }

}
