class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int a[] = new int[256];
        int l = 0;
        for(int r= 0; r< s.length(); r++){
            char x = s.charAt(r);
            a[x]++;
            while(a[x] > 1){
                a[s.charAt(l)]--;
                l++;
            }
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}
