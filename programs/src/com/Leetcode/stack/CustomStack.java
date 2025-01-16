public class CustomStack {
    int[] data;
    private static final int default_size = 10;
    int ptr = -1;

    public CustomStack(){
        data = new int[default_size];
    }
    public CustomStack(int size){
        data = new int[size];
    }

    public boolean isEmpty() {
        if(ptr == -1) return  true;
        return false;
    }
    public boolean isFull(){
        if(ptr == data.length - 1) return true;
        return false;
    }

    public int peek() throws CustomStackException{
        if(isEmpty()){
            throw new CustomStackException("can peek from empty stack");
        }
        return data[ptr];
    }
    public boolean push(int ele){
        if(isFull()){
            System.out.println("can not push! stack is full");
            return false;
        }
        data[++ptr] = ele;
        return true;
    }
    public int pop() throws CustomStackException{
        if(isEmpty()){
            throw new CustomStackException("can not pop from empty stack!");
        }
        int rmoved = data[ptr];
        ptr--;
        return rmoved;
    }

}
