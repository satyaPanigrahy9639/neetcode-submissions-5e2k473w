class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(nums);
        for(int i= 0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i+1;
            int k = nums.length - 1;
            while(l<k){
                int sum = nums[i]+nums[l]+nums[k];
                if(sum ==0){
                    res.add(Arrays.asList(nums[i], nums[l], nums[k]));
                    while(l<k && nums[l] == nums[l+1])l++;
                    while(l<k && nums[k] == nums[k-1])k--;
                    l++;
                    k--;
                }
                if(sum < 0){
                    l++;
                }
                if(sum > 0){
                    k--;
                }
            }
        }
        return res;
    }
}
