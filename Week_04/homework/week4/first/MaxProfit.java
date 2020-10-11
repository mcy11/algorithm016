package homework.week4.first;

/**
 * @author yd
 * @version 1.0
 * @date 2020-10-10 09:46
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]){
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
