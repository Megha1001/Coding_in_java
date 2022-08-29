class FindNthFromLastUsingLen{
    
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
        
        System.out.println("\n4th node from end is :");
        findNthFromLast(head, 4);
    }
    
    
    /*
    Approach : Find length of linked list
    if len < n --> invalid position --> return
    else , run loop from i = 0-> i < len-n+1
    then , print node's data
    */
    static void findNthFromLast(Node head, int n){
        
        int len = 0;
        Node temp = null;
        //count length
        for(temp = head; temp != null; temp = temp.next){
            len++;
        }

        // invalid n
        if(len < n){
            return ;
        }
        
        temp = head;
        for(int i = 1; i < len - n + 1; i++){
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

/*
Given LL is :
50 40 30 20 10 
4th node from end is :
40

*/
