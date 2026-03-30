class Solution {
    public boolean isPalindrome(String s) {
        String st = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i = 0;
        int j = st.length();
        while(i<=j && j>0 && st.charAt(i)==st.charAt(j-1)){
                i++;
                j--;
        }
        if(j<=i)
            return true;
        else
            return false;
    }
}
