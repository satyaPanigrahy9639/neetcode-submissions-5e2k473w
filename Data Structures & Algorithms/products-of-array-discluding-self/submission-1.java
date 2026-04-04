class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l[] = new int[nums.length];
        int r[] = new int[nums.length];

        for(int i = 0; i<nums.length;i++){
            if(i ==0)
            l[i] = 1;
            else
                l[i] = l[i-1]*nums[i-1];
        }
        for(int i = nums.length-1; i>=0;i--){
            if(i ==nums.length - 1)
                r[i] = 1;
            else
                r[i] = r[i+1]*nums[i+1];
        }
        for(int i = 0; i<nums.length;i++){
            nums[i] = l[i]*r[i];
        }

        return nums;
    }
}  
