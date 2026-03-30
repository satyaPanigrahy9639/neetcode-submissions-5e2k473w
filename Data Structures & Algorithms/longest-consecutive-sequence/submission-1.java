class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int count = 0;
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 1)
                count++;
            else if(nums[i + 1] - nums[i] == 0)
                continue;
            else if (nums[i + 1] - nums[i] > 1) {
                count = 0;
            }
            if (count > res)
                res = count;
        }
        return res+1;
    }
}
