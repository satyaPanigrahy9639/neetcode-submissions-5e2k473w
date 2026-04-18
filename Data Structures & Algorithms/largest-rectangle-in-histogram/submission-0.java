class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i<heights.length; i++){
            while (!st.isEmpty() && heights[st.peek()] > heights[i]){
                int ele = heights[st.peek()];
                st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                max = Math.max(max, ele*(nse-pse-1));
            }
           st.push(i);
        }
        while (!st.isEmpty()){
            int ele = heights[st.peek()];
            st.pop();
            int nse = heights.length;
            int pse = st.isEmpty() ? -1 : st.peek();
            max = Math.max(max,ele*(nse-pse-1));
        }
        return max;
    }
}
