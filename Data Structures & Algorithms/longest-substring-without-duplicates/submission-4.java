class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a[] = new int[256];
        int m = 0;
        int l = 0;
        int r = 0;
        while(r<s.length()){
            char c = s.charAt(r);
            a[c]++;
            while(a[c] > 1){
                a[s.charAt(l)]--;
                l++;
            }
            m = Math.max(m, r-l+1);
            r++;
        }
    return m;
    }
}
