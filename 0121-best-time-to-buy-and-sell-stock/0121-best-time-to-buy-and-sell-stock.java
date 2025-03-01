class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxProfit = 0;
        int n = prices.length;
        for(int i=1; i<n; i++) {
            int profit = prices[i]-mini;
            maxProfit = Math.max(profit, maxProfit);
            mini = Math.min(prices[i], mini);
        }
        return maxProfit;
    }
}