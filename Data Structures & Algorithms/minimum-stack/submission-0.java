class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minEleStack;
    public MinStack() {
        stack = new Stack<>();
        minEleStack = new Stack<>();
    }
    
    public void push(int val) {
        if(minEleStack.isEmpty()){
            minEleStack.push(val);
        } else if(minEleStack.peek() > val){
            minEleStack.push(val);
        } else{
            minEleStack.push(minEleStack.peek());
        }
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
        minEleStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minEleStack.peek();
    }
}
