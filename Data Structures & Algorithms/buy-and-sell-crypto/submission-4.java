class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int current;
        int maxP = 0;
        while( r < prices.length) {
          if(prices[l] < prices[r]) {
            current = prices[r] - prices[l];
            maxP = Math.max(current, maxP);
          } else {
            l = r;
          }
          r++;
        }
        return maxP;
    }
}
