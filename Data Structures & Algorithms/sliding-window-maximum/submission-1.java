class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int res[] = new int[n-k+1];
        
        if(n==0)
            return res;
        for(int i = 0; i< n; i++){
            //1. remove the element out of the k window.
            if(!dq.isEmpty() && dq.peekFirst()<=i-k)
                dq.pollFirst();

            //2. Keep removing the smaller elements if they are smaller than the incoming one
            while(!dq.isEmpty() && nums[dq.peekLast()]< nums[i])
                dq.pollLast();

            dq.offerLast(i);

            if(i>= k-1)
                res[i-k+1] = nums[dq.peekFirst()];
        }
        return res;
    }
}
