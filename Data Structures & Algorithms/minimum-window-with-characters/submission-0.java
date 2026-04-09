class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : t.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }

        int l = 0, need = t.length(), have = 0;
        int min = Integer.MAX_VALUE;
        String res ="";
        HashMap<Character, Integer> cm = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            char p = s.charAt(r);
            cm.put(p, cm.getOrDefault(p,0)+1);
            if(hm.containsKey(p) && cm.get(p) <= hm.get(p)){
                have++;
            }
            while (have == need) {
                int windowLen = r - l + 1;
                if(windowLen < min){
                    min = windowLen;
                    res = s.substring(l,r+1);
                }
                char m = s.charAt(l);
                cm.put(m, cm.get(m) - 1);
                if (hm.containsKey(m) && cm.get(m) < hm.get(m)) {
                    have--;
                }
                l++;
            }
        }
        return res;
    }
}
