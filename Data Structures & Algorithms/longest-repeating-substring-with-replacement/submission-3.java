class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxFreq = 0;
        int maxWindow = 0;
        int ar[] = new int[26];
        int charToChange = 0;
        for(int r = 0; r< s.length(); r++){
            ar[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, ar[s.charAt(r)- 'A']);
            charToChange = (r-l+1) - maxFreq;
            if(charToChange > k){
                ar[s.charAt(l) - 'A']--;
                l++;
            }
            maxWindow = Math.max(maxWindow, (r-l+1));
        }
        return maxWindow;
    }
}
