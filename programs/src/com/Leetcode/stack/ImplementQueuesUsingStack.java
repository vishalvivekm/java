class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int peek;
    public MyQueue() {
     stack1 = new Stack<>();
     stack2 = new Stack<>();   
    }
    
    public void push(int x) {
        if(stack1.isEmpty()){
            peek = x;
        }
        stack1.push(x);
    }
    
    public int pop() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int rmved = stack2.pop();
        if(!stack2.isEmpty()){
             peek = stack2.peek();
        }
       
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return rmved;
    }
    
    public int peek() {
        return peek;
    }
    
    public boolean empty() {
        return stack1.isEmpty();
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
