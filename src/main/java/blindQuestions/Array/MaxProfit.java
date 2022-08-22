package blindQuestions.Array;

public class MaxProfit {

    public int maxProfit(int[] prices) { // [2.4.1]
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if ( max < (prices[j]-prices[i])){
                    max = prices[j]-prices[i];
                }
            }
        }
        return max;
    }

}
