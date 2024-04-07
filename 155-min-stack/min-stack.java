class MinStack {
    
    Stack<int[]> s = new Stack(); 
    int min = Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
        min = Math.min(min,val);
        s.push(new int[]{val,min});
    }
    
    public void pop() {
        s.pop();
        if(s.isEmpty())min = Integer.MAX_VALUE;
        else {
            min = s.peek()[1];
        }
    }
    
    public int top() {
        return s.peek()[0];
    }
    
    public int getMin() {
                return s.peek()[1];

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */