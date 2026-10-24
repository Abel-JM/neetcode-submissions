class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }

        int maxP = 0;
        int minB = prices[0];

        for(int sell: prices){
            maxP = Math.max(maxP, sell-minB);
            minB = Math.min(minB, sell);
        }
        return maxP;
    }
}
