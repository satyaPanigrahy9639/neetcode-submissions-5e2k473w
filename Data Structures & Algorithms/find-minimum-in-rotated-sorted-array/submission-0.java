class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int h = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while (l<=h){
            int mid = (l+h)/2;
            //check if left half is sorted. If so, take the min value and eliminate this side.
            if(nums[l]<=nums[mid]){
                ans = Math.min(ans, nums[l]);
                l = mid+1;
            }
            //check if right half is sorted. If so, take the min value and eliminate this side.
            else if(nums[mid]<=nums[h]){
                ans = Math.min(ans, nums[mid]);
                h = mid-1;
            }
        }
        return ans;
    }
}
