// reverse the string in-place


class Solution {
    public void reverseString(Vector<Character> s) {
        //your code goes here
        // int start = 0;
        // int end = s.size() - 1;

        // while(start < end){
        //     Character temp = s.get(start);
        //     s.set(start, s.get(end));
        //     s.set(end, temp);
        //     start++;
        //     end--;
        // }

        // aliter approach, using stack
        // Stack<Character> stack = new Stack<>();

        // for(char c: s){
        //     stack.push(c);
        // }
        // int i = 0;
        // while(!stack.isEmpty()){
        //     s.set(i++, stack.pop());
        // }

        // aliter approach, using Deque
        // faster and more efficient than Stack (which is synchronized and legacy)
        Deque<Character> deque = new ArrayDeque<>();

        for(char c: s){
            deque.push(c);
        }
        int i = 0;
        while(!deque.isEmpty()){
            s.set(i++, deque.pop());
        }

        
    }
}
