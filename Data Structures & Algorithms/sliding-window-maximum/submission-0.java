class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int []res = new int[nums.length-(k-1)];
        for (int i = 0; i< nums.length;i++){
            int j = i;
            while (j <= (i+(k-1)) && (i+(k-1)) < nums.length){
                max = Math.max(max, nums[j]);
                j++;
            }
            if(i<res.length)
                res[i] = max;
            max = Integer.MIN_VALUE;
        }
        return res;
    }
}
