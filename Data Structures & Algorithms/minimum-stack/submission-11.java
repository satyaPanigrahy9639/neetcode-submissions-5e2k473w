class MinStack {

    private Deque<Long> d;
    private long min;
public MinStack() {
        this.d = new ArrayDeque<>();
        this.min = Integer.MAX_VALUE;
}

public void push(int val) {
    long v = val;
    if(this.d.isEmpty()) {
        this.min = v;
        this.d.push(v);
    }
    else if(this.getMin() > v) {
        this.d.push(2 * v - this.getMin());
        this.min = v;
    }
    else {
        this.d.push(v);
    }
}

public void pop() {
    if (this.d.isEmpty()) {
        this.min = Integer.MAX_VALUE;
        return;
    }
    if(this.getMin() > this.d.peek()){
        this.min = 2*this.min - this.d.peek();
    }
    this.d.pop();
}

public int top() {
    if (this.d.isEmpty()){
        min = Integer.MAX_VALUE;
        return 0; // or throw
    }

    if (this.d.peek() < this.min) {
        return (int) this.min;
    }
    return Math.toIntExact(this.d.peek());
}

public int getMin() {
    if (this.d.isEmpty()) {
        this.min = Integer.MAX_VALUE;
    }
    return (int) this.min;
}
}
