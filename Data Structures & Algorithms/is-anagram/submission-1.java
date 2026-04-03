class Solution {
    public boolean isAnagram(String s, String t) {
        int a[] = new int[26];
        int ind = 0;
        for (int i=0;i<s.length();i++){
            ind = s.charAt(i)-'a';
            a[ind]+=1;
        }
        for (int i=0;i<t.length();i++){
            ind = t.charAt(i)-'a';
            a[ind] -=1;
        }
        for (int i=0;i<a.length;i++){
            if(a[i] !=0)
                return false;
        }
        return true;
    }
}
