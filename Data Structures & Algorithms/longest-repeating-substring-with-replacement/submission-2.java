class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int maxF = 0;
        int max = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while(r<s.length()){
            char x = s.charAt(r);
            hm.put(x, hm.getOrDefault(x,0)+1);
            maxF = Math.max(maxF, hm.get(x));
            if((r-l+1)-maxF>k){
                char leftChar = s.charAt(l);
                hm.put(leftChar, hm.get(leftChar) - 1);
                l++;
            }
            max = Math.max(max, r-l+1);
            r++;
        }
        return max;
    }
}
