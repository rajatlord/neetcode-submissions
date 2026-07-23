class Solution {
    public int maxProfit(int[] prices) {
        // int maxprofit = 0;
        // for(int i = 0; i < prices.length; i++){
        //     for(int j = i+1; j < prices.length; j++){
        //     int currProfit = prices[j] - prices[i];
        //         if( currProfit > maxprofit ){
        //             maxprofit = currProfit;
        //         }
        //     }
        // }
        // return maxprofit;
        // int maxprofit = 0;
        // int left = 0;
        // int right = prices.length - 1;
        // while(left < right){
        //     int currProfit = prices[right] - prices[left];
        //     if( currProfit > maxprofit ){
        //             maxprofit = currProfit;
        //         }
        //     left++;
        //     right--;
        // }
        // return maxprofit;

        // correct solution
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int currentProfit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }
}
