class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l[] = new int[nums.length];
        int r[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0)
                l[i] = 1;
            else if(i==1)
                l[i] = nums[i-1];
            else
                l[i] = l[i-1]*nums[i-1];
        }
        for(int j=nums.length-1;j>=0;j--){
            if(j==nums.length-1)
                r[j] = 1;
            else if(j==nums.length-2)
                r[j] = nums[j+1];
            else
                r[j] = r[j+1]*nums[j+1];
        }
        for(int k=0;k<nums.length;k++){
            nums[k] = l[k]*r[k];
        }
        return nums;
    }
}  
