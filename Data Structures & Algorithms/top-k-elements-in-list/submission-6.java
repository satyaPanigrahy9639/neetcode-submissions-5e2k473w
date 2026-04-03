class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(Integer i: nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> c[] = new ArrayList[nums.length+1];
        for(Map.Entry p: hm.entrySet()){
            int ind = (int) p.getValue();
            if(c[ind] == null)
                c[ind] = new ArrayList<>();
            c[ind].add((int) p.getKey());
        }
        int r[] = new int[k];
        for(int l = c.length-1; l>=0; l--){
            if(k>0){
                if(c[l]!=null) {
                    for (Integer i : c[l]) {
                        r[k-1] = i;
                        k--;
                    }
                }
            }
        }
        return r;
    }
}
