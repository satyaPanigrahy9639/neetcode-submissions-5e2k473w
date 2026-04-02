class Solution {
    public int trap(int[] height) {
        int pre[] = new int[height.length];
        int suf[] = new int[height.length];
        int max = 0;
        for(int i= 0; i < height.length; i++){
            if(i==0)
                pre[i] = height[i];
                if(height[i]>max) {
                    max = height[i];
                }
            pre[i] = max;
            }
        max = 0;
        for(int j= suf.length-1; j >= 0; j--){
            if(j==suf.length-1)
                suf[j] = height[j];
            if(height[j]> max){
                max = height[j];
            }
                suf[j] = max;
        }
        int res = 0;
        for(int k= 0; k< height.length; k++){
            res = res +(Math.min(pre[k], suf[k])-height[k]);
        }

        return res;
    }
}
