class MinStack {

    private static final int dsize = 30000;
    int[] data;
    int ptr = -1;
    int[] min;
    int minIndex = -1;
    public MinStack() {
        data = new int[dsize];
        min = new int[dsize];
    }
    public boolean isFull(){
        return ptr == data.length - 1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
    public void push(int val) {
        if(isEmpty()){
            min[++minIndex] = val;
            data[++ptr] = val;
            return;
        }
        if(isFull()){
            return;
        }
        data[++ptr] = val;
       
       if(val <= min[minIndex]){
        min[++minIndex] = val;
       }
        
    }
    
    public void pop() {
        if(data[ptr] == min[minIndex]){
            minIndex--;
        }
        ptr--;
    }
    
    public int top() {
        return data[ptr];
    }
    
    public int getMin() {
        return min[minIndex];
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
