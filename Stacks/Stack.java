class Stack{
    private int arr[];
    private int top;
    private int capacity;
    
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    
    public void push(int item){
        if(isFull()){
            System.out.println("Overflow! Program Terminated.");
            System.exit(1);
        }
        
        System.out.println("Inserting : "+ item);
        arr[++top] = item;
    }
    
    public boolean isFull(){
        return top == (capacity -1);
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        
        System.out.println("Removing item at top");
        
        return arr[top--];
    }
    
    public boolean isEmpty(){
        return top == -1;    
    }
    
    public void printStack()    {
        for(int i = 0; i <= top ; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String [] args){
        Stack stack = new Stack(5);
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        stack.pop();
        
        System.out.println("After popping out : ");
        stack.printStack();
    }
    
}
