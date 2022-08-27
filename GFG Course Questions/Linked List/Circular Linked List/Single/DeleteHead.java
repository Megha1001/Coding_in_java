class DeleteHead {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        System.out.println("Insert 10,20,30,40,50 in CLL at end");
        head = insertAtEndO_1(head, 10);
        head = insertAtEndO_1(head, 20);
        head = insertAtEndO_1(head, 30);
        head = insertAtEndO_1(head, 40);
        head = insertAtEndO_1(head, 50);
        System.out.println("\nCLL :");
        printCLL(head);
        
        System.out.println("\nCLL after deleting head node via O(N) approach");
        head = deleteHeadNodeO_N(head);
        printCLL(head);
        System.out.println("\nCLL after deleting head node via O(1) approach");
        head = deleteHeadNodeO_1(head);
        printCLL(head);
    }
    
    static Node insertAtEndO_1(Node head, int data){
        Node node = new Node(data);
        if(head == null){
            node.next = node;
            return node;
        }
        //insert after head
        node.next = head.next;
        head.next = node;
        
        //swapping
        int t = head.data;
        head.data = node.data;
        node.data = t;
        
        // new head is new node
        return node;
    }

/*
  Approach 1 : Maintain a temp reference and go to end of LL then delete it
  Time Complexity : O(N)
  */
    static Node deleteHeadNodeO_N(Node head){
        //single node
        if(head == null || head.next == head){
            return null;
        }
        
        Node temp = head;
        //find last node
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        //temp.next= head.next;
        return temp.next;
    }
    static void printCLL(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data+" ");
        for(Node r = head.next; r != head; r = r.next){
            System.out.print(r.data+" ");
        }
    }

  
  /*
  Approach 2: copy the data of head's next node in head node then delete head's next node
  Time Complexity : O(1)
  */

    static Node deleteHeadNodeO_1(Node head) {
        if(head == null || head.next == head){
            return null;
        }
        
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

}
