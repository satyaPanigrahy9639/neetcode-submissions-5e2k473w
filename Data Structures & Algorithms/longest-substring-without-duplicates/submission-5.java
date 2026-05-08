class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] r = new int[256];
        int i =0;
        int j = 0;
        int max = 0;
        while(j< s.length()){
            r[s.charAt(j)]++;
            while(r[s.charAt(j)]>1){
                r[s.charAt(i)]--;
                i++;
            }
            max = Math.max(max, j-i+1);
            j++;
        }
    return max;
    }
}
