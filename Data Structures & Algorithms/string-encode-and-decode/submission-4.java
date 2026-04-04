class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s: strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> s = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            j++;
            s.add(str.substring(j, j + len));
            i = j + len - 1;
        }
        return s;
    }
}
