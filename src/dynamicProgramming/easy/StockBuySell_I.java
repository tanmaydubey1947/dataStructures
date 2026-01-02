package dynamicProgramming.easy;

public class StockBuySell_I {

    public int stockBuySell(int[] arr, int n) {

        int minSoFar = arr[0];
        int ans = 0;

        for (int i = 1; i < n; i++) {

            int curProfit = arr[i] - minSoFar;
            if (ans < curProfit) {
                ans = curProfit;
            }

            if (minSoFar > arr[i]) {
                minSoFar = arr[i];
            }
        }

        return ans;
    }
}
