class MyQueue {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack1 = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        while(!stack.isEmpty()){
            stack1.push(stack.pop());
        }
        int val = stack1.pop();
        while(!stack1.isEmpty()){
            stack.push(stack1.pop());
        }

        return val;
    }
    
    public int peek() {
        while(!stack.isEmpty()){
            stack1.push(stack.pop());
        }
        int val = stack1.peek();
        while(!stack1.isEmpty()){
            stack.push(stack1.pop());
        }

        return val;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */