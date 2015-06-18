package Arrays;

/**
 * Created by HDegano on 6/17/2015.
 */
public class BuySellStockOnce {

    public int maxProfit(int[] prices) {

        if(prices == null || prices.length < 2) return 0;

        int minPrice = prices[0];

        int maxProfit = 0;

        int n = prices.length;

        for(int i = 1; i < n; i++){

            int testProfit = prices[i] - minPrice;

            if(testProfit > maxProfit){

                maxProfit = testProfit;
            }

            if(prices[i] < minPrice)
                minPrice = prices[i];

        }

        return maxProfit;
    }
}
