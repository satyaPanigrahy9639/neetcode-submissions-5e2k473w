class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int m = Integer.MIN_VALUE;
        for(int i = 0;i<piles.length;i++){
            m = Math.max(m, piles[i]);
        }
        int l = 1;
        int mid = 0;
        int n = piles.length;
        int ans = Integer.MAX_VALUE;
        while(l<=m){
            mid = (l+m)/2;
            double hrs = find(piles, mid);
            if(hrs<=h){
                ans = (int) mid;
                m = mid-1;
            }
            else if(hrs>=h){
                l = mid+1;
            }
        }
        return ans;
    }
    private static double find(int[] piles, int mid) {
        double ceil = 0;
        for(int i = 0;i<piles.length;i++)
            ceil = ceil + Math.ceil((double) piles[i]/(double) mid);
        return ceil;
    }
}
