class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s: strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> ss = new ArrayList<>();
        while(i<str.length()) {
            int j = i;
            while (str.charAt(j)!='#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            ss.add(str.substring(j+1,j+1+len));
            i = j+1+len;
        }
            return ss;
    }
}
