class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i= 0;
        int j = ss.length()-1;
        while(i<=j){
            if(ss.charAt(i) == ss.charAt(j)){
                i++;j--;
            }
            else
                return false;
        }
        if(i>j)
            return true;
        else
            return false;
    }
}
