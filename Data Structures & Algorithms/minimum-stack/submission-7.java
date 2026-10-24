class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> mstack;

    public MinStack() {
        stack = new Stack<>();
        mstack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(mstack.isEmpty() || val <= mstack.peek()){
            mstack.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int top = stack.pop();
        if (top == mstack.peek()){
            mstack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {

        return mstack.peek();
    }
}
