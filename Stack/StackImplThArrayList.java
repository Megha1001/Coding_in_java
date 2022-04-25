import java.util.ArrayList;

class StackImplThArrayList {
    static class Stack{
        public static ArrayList<Integer> list = new ArrayList<>();
        
        public static boolean isEmpty(){
           return list.size() == 0;
        }
        
        public static int getLastIndex(){
           return list.size() - 1;
        }
        
        public static void push(int data){
            list.add(data);
        }
        
        public static int  pop(){
            if(isEmpty()){
                return -1;
            }
            
            return list.remove(getLastIndex());
        }
        
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(getLastIndex());
        }
    }
    
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
