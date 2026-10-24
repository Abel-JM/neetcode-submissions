class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }

        int maxP = 0;

        for(int i=0;i<prices.length; i++){
            for(int j=i+1;j<prices.length; j++){
                maxP = Math.max(maxP, (prices[j]-prices[i])); 
            }
        }
        return maxP;
    }
}
