import java.util.Stack;

class StackReverseThBruteForce{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        Stack<Integer> reverseStack = new Stack<>();
        
        while(!stack.isEmpty()){
            reverseStack.push(stack.peek());
            stack.pop();
        }
        
        while(!reverseStack.isEmpty()){
            System.out.println(reverseStack.peek());
            reverseStack.pop();
        }
    }
}
