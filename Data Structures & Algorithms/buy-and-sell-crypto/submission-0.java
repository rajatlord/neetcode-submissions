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
        // not a correct solution 
        int maxprofit = 0;
        int left = 0;
        int right = prices.length - 1;
        while(left < right){
            int currProfit = prices[right] - prices[left];
            if( currProfit > maxprofit ){
                    maxprofit = currProfit;
                }
            left++;
            right--;
        }
        return maxprofit;

        
    }
}
