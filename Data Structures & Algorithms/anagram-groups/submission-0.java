class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, ArrayList<String>> hm = new HashMap<>();

        for(String word: strs){
            int a[] = new int[26];
            for(char c: word.toCharArray()){
                a[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i: a){
                sb.append(i).append("#");
            }
            hm.putIfAbsent(sb.toString(), new ArrayList());
            hm.get(sb.toString()).add(word);
        }
            for(Map.Entry m: hm.entrySet()){
                res.add((List<String>)m.getValue());
            }
            return res;
        }
    }
