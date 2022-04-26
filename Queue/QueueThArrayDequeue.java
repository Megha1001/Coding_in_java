import java.util.*;

class QueueThArrayDequeue {
    public static void main(String[] args) {
        //Queue is interface
        Queue<Integer> q = new ArrayDeque<>();
        
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
