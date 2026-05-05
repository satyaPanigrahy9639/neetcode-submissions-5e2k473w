class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for (int i: nums){
            s.add(i);
        }
        int res = 0, c= 0;
        for (Integer i: s){
            if(!s.contains(i-1)) {
                c= 0;
                while (s.contains(i)) {
                    c++;
                    i++;
                }
            }
            res = Math.max(res, c);

        }
        return res;
    }
}
