class CircularQueueThArray {
    static class Queue{
        static int[] input;
        static int size;
        static int rear = -1;
        static int front = -1;
        
        Queue(int size){
            input = new int[size];
            this.size = size;
        }
        
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        
        public static boolean isFull(){
            return (rear + 1) % size == front;
        }
        
        public static void add(int data){
            if(isFull()){
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            input[rear] = data;
        }
        
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int result = input[front];
            //single element condition
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front + 1) % size;
            }
            
            return result;
        }
        
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return input[front];
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue(5);
        
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
