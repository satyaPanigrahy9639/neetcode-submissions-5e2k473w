class Solution {
    public boolean isAnagram(String s, String t) {
        int l = s.length();
        int m = t.length();
        if(l!=m)
        return false;
        HashMap<Character, Integer> hm = new HashMap();
        for(int i=0;i<l;i++){
            if(hm.get(s.charAt(i))==null)
            hm.put(s.charAt(i),1);
            else
            hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
        }
        for(int j=0;j<m;j++){
            if(hm.containsKey(t.charAt(j))){
                hm.put(t.charAt(j), hm.get(t.charAt(j))-1);
            }
        }
        for(Map.Entry<Character, Integer> e: hm.entrySet()){
            if(e.getValue()!= 0)
            return false;
        }
        return true;
    }
}
