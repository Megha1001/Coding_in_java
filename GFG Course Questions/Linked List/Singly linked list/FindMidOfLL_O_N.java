class FindMidOfLL_O_N{
    
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
        }
    }
    
    
    public static void main(String []args){
        Node head = null;
        head = insertAtBeginO_1(head, 10);
        head = insertAtBeginO_1(head, 20);
        head = insertAtBeginO_1(head, 30);
        head = insertAtBeginO_1(head, 40);
        head = insertAtBeginO_1(head, 50);
        System.out.println("Given LL is :");
        printLL(head);
        
        System.out.println("\nInsert 70 at middle");
        insertAtMiddleO_N(head);
    }
    
    
    /*
    Approach : count number of nodes
            - Run a loop from head with i =0 to i < count/2 and inc temp ptr
            - Print data after the loop
    Time Complexity : O(N)
    */
    static void insertAtMiddleO_N(Node head){
        if(head == null){
            return;
        }
        
        int count = 0;
        Node temp;
        for(temp = head; temp != null; temp = temp.next){
            count++;
        }
        
        temp = head;
        for(int i = 0; i < count/2; i++){
            temp = temp.next;
        }
        
        System.out.println(temp.data);
    }
    
    static void printLL(Node head){
        if(head == null){
            return;
        }
        
        for(Node temp = head; temp != null; temp = temp.next){
            System.out.print(temp.data+" ");
            
        }
    }
    
    static Node insertAtBeginO_1(Node head, int x){
        Node node = new Node(x);
        if(head == null){
            return node;
        }
        
        node.next = head;
        return node;
    }
}
