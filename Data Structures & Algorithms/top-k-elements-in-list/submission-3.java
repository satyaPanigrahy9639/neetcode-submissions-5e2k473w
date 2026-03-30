class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     Map<Integer, Integer> hm = new HashMap<>();
        if(nums.length == 1)
            return nums;
        if(nums.length==2){
            if(nums[0]==nums[1])
                return new int[]{nums[0]};
            else
                return nums;
        }
        for (int i = 0; i < nums.length; i++) {
            if (hm.get(nums[i]) == null)
                hm.put(nums[i], 1);
            else
                hm.put(nums[i], hm.get(nums[i]) + 1);
        }
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            int freq = e.getValue();
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
                bucket[freq].add(e.getKey());
            }
        int[] res = new int[k];
        int index = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (k > 0) {
                if (bucket[i] != null) {
                    for (Integer l : bucket[i]) {
                        res[index] = l;
                        index++;
                        k--;
                        if (k == 0)
                            break;
                    }
                }
            }
        }
        return res;
    }
}
