class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l = 0, r = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : s1.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        while (r < s2.length()) {
            HashMap<Character, Integer> m = new HashMap<>();
            int len1 = s1.length();
            int d = r;
            while (len1 > 0 && (d+len1)<= s2.length()) {
                char c = s2.charAt(d);
                m.put(c, m.getOrDefault(c, 0) + 1);
                len1--;d++;
            }
            if (hm.equals(m))
                return true;
            r++;
        }
        return false;
    }
}
