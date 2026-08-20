class Solution {
  public int maxProfit(int[] prices) {
    int current;
    int profit = 0;
    int min = prices[0];
    for(int i = 0; i < prices.length; i++) {
      if(prices[i] <= min) {
        for(int j = i; j < prices.length; j++) {
          current = prices[j] - prices[i];
          if(current > profit) profit = current;
        }
      }
    }
    if(profit < 0) return 0;
    else return profit;
  }
}