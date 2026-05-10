class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : t.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        int uniqueCharCount = hm.size();
        int r = 0, l = 0, minLen = Integer.MAX_VALUE;
        int startIndex = -1;
        while(r< s.length()){
            char c = s.charAt(r);
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)-1);
                if(hm.get(c) == 0){
                   uniqueCharCount--; 
                }
            }
            while(uniqueCharCount == 0){
                if(r-l+1 < minLen){
                    minLen = r - l +1;
                    startIndex = l;
                }
                c = s.charAt(l);
                if(hm.containsKey(c)){
                    hm.put(c, hm.get(c)+1);
                        if(hm.get(c) > 0)
                            uniqueCharCount++;
                }
                l++;
            }
            r++;
        }
        if(startIndex == -1)
            return "";
        return s.substring(startIndex, startIndex+minLen);
    }
}
