public class Main{
    public static void main(String[] args){

        try{
            CustomStack stack = new CustomStack(4);
            System.out.println(stack.isEmpty());
            //  stack.push(10);
           // System.out.println(stack.peek());
            for(int i = 0; i < 4; i++){
                stack.push(i);
            }

            System.out.println(stack.peek());
            System.out.println(stack.peek());
            System.out.println(stack.isFull());
            stack.push(5);
            System.out.println(stack.pop());
            System.out.println(stack.isFull());
        } catch(Exception e){
            e.printStackTrace();
//            System.out.println(e);
//            System.out.println(e.getMessage());
//            System.out.println(e.getStackTrace());
        }
    }
}
