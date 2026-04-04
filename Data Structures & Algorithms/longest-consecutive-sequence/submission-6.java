class Solution {
    public int longestConsecutive(int[] nums) {
        int i = 0;
        int j = 1;
        int len = 1;
        int max = 0;
        if(nums.length == 0 || nums.length == 1)
            return nums.length;
        Arrays.sort(nums);
        while(j<nums.length){
            if(nums[j] == nums[i]+1){
                len +=1;
            }
            else if(nums[j] > nums[i]+1){
                len = 1;
            }
            max = Math.max(max,len);
            i++;
            j++;
        }
        return max;
    }
}
