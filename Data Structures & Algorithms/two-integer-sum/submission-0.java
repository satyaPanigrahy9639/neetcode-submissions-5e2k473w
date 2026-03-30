class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(i, nums[i]);
        }
        int[] res = new int[2];
        for(int j=0;j<nums.length;j++){
            res = new int[2];
            int d = target - hm.get(j);
            res[0] = j;
            for(Map.Entry m: hm.entrySet()){
                        if(Objects.equals(m.getValue(), d)) {
                            int o = (int) m.getKey();
                            if(j==o)
                                continue;
                            res[1] = o;
                            return res;
                        }
                    }
        }
        return res;
    }
}
