class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int ar1[] = new int[26];
        int ar2[] = new int[26];
        if(l1>l2) return false;
        for(int i = 0; i< l1; i++){
            ar1[s1.charAt(i) - 'a']++;
            ar2[s2.charAt(i) - 'a']++;
        }
        if(isMatched(ar1, ar2))
            return true;
        for(int i = 1; i<= l2 - l1; i++){
            ar2[s2.charAt(i-1) - 'a']--;
            ar2[s2.charAt(i+l1-1) - 'a']++;
            if(isMatched(ar1,ar2))
                return true;
        }

        return false;
    }

    private boolean isMatched(int[] ar1, int[] ar2){
        for(int i=0; i<ar1.length;i++){
            if(ar1[i] != ar2[i])
                return false;
        }
        return true;
    }
}
