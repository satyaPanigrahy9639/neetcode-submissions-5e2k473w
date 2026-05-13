class MinStack {

    Deque<Long> d;
    private long minimum;
    public MinStack() {
        d = new ArrayDeque<>();
        minimum = Integer.MAX_VALUE;
    }

    public void push(int val) {
        long v = val;
    if(this.d.isEmpty()) {
        this.minimum = v;
        this.d.push(v);
    }
    else if(this.getMin() > v) {
        this.d.push(2 * v - this.getMin());
        this.minimum = v;
    }
    else {
        this.d.push(v);
    }
    }

    public void pop() {
        if (this.d.isEmpty()) {
        this.minimum = Integer.MAX_VALUE;
        return;
    }
    if(this.getMin() > this.d.peek()){
        this.minimum = 2*this.minimum - this.d.peek();
    }
    this.d.pop();
    }

    public int top() {
        if (this.d.isEmpty()){
        minimum = Integer.MAX_VALUE;
        return 0; // or throw
    }

    if (this.d.peek() < this.minimum) {
        return (int) this.minimum;
    }
    return Math.toIntExact(this.d.peek());
    }

    public int getMin() {
        return (int)minimum;
    }
}
