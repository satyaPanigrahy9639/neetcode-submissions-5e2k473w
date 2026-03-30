class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i:nums){
            Integer j = i;
            if(hm.get(j)==null){
                hm.put(j, 1);
            }
            else
            return true;
        }
        return false;
    }
}