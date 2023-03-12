package arrays;

public class MaxProfit {

    /**
     * Leetcode Link : <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">...</a>
     * <p>
     * Iteration for better approach : 1
     * </p>
     *
     * <p>
     * We need two variables one will be maxProfit and other will be minPrice. Iterate through array and check if the stock price is less compared to previous,
     * if yes then update the minPrice. Now subtract the min stock price till now with the today's stock price, if it is greater than maxProfit update
     * the maxProfit
     * <p>
     * Time Complexity : O(n)
     * </p>
     */


    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

    }

    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
