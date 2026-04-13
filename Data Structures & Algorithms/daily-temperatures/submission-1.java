class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Deque<Integer> d = new ArrayDeque();
        for (int i = 0; i<temperatures.length;i++) {
            while (!d.isEmpty() && temperatures[i] > temperatures[d.peek()]){
                int j = d.pop();
                res[j] = i - j;
            }
            d.push(i);
        }
        return res;
    }
}
