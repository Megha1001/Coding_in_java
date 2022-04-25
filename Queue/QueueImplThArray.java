class QueueImplThArray{
    
    static class Queue{
        static int [] input;
        static int size;
        static int rear = -1;
        
        Queue(int size){
            input = new int[size];
            this.size = size;
        }
        
        public static boolean isEmpty(){
            return rear == -1;
        }
        
        // Enqueue - O(1)
        public static void add(int data){
            if(rear == size - 1){
                return;
            }
            ++rear;
            input[rear] = data;
        }
        
        // Dequeue - O(n)
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = input[0];
            for(int i = 0 ; i < rear ; i++){
                input[i] = input[i + 1];
            }
            --rear;
            return front;
        }
        
        
        // Front - O(n)
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return input[0];
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue(5);
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
