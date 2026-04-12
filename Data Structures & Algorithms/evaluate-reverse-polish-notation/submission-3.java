class Solution {
    public int evalRPN(String[] tokens) {
Deque<Integer> d = new ArrayDeque();

        for(String s: tokens){
            switch (s){
                case "+":
                    int a = d.pop();
                    int b = d.pop();
                    d.push(a + b);
                    break;
                case "-":
                    a = d.pop();
                    b = d.pop();
                    d.push(b - a);
                    break;
                case "*":
                    a = d.pop();
                    b = d.pop();
                    d.push(a * b);
                    break;
                case "/":
                    a = d.pop();
                    b = d.pop();
                    d.push(b / a);
                    break;
                default:
                    d.push(Integer.valueOf(s));
            }
        }
        return (int) d.pop();
    }
}
