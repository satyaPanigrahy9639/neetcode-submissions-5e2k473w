class Solution {
    public int maxProfit(int[] prices) {
        int b = 0;
        int s = 1;
        int max = 0;

        while (s<prices.length){
            if(prices[b]>prices[s]){
                b=s;
            }
            else if(prices[b]<=prices[s]){
                max = Math.max(max,prices[s]-prices[b]);
            }
            s++;
        }
        return max;
    }
}
