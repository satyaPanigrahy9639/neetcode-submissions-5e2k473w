class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        //sort the array
        Arrays.sort(nums);
        
        for(int i = 0; i< nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i+1;
            int r = nums.length-1;
            while(j<r){
                //check the second elements duplicates
                int sum = nums[i]+nums[j]+nums[r];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[j], nums[r]));
                    while(j<r && nums[j] == nums[j+1])j++;
                    while(j<r && nums[r] == nums[r-1])r--;
                    j++;r--;
                }
                else if(sum < 0){
                    j++;
                }
                else
                    r--;
                
            }
        }
        return res;
    }
}
