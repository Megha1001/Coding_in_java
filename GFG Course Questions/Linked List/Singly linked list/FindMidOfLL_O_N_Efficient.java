class FindMidOfLL_O_N_Efficient{
    
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
        insertAtMiddleO_N_Eff(head);
    }
    
    
    /*
    Approach : Take two pointers : slow and fast
        move slow by one position and fast by two position until fast != null(for even num of nodes) && fast.next != null(for odd num of nodes)
    Time Complexity : O(N)
    */
    static void insertAtMiddleO_N_Eff(Node head){
        if(head == null){
            return;
        }
        
       Node slow = head;
       Node fast = head;
       
       while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }
       
       System.out.println(slow.data);
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
OUTPUT :
Given LL is :
50 40 30 20 10 
Insert 70 at middle
30
*/
