class InsertAtEnd {
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
        head = insertAtEndO_N(head, 10);
        head = insertAtEndO_1(head, 20);
        head = insertAtEndO_1(head, 30);
        head = insertAtEndO_N(head, 40);
        head = insertAtEndO_N(head, 50);
        System.out.println("\nCLL :");
        printCLL(head);
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
  Approach 1 : Maintain a temp reference and go to end of LL then insert it
  Time Complexity : O(N)
  */
  
    static Node insertAtEndO_N(Node head, int x) {
       Node node = new Node(x);
       if(head == null){
           node.next = node;
           return node;
       }
       
       Node temp = head;
       while(temp.next != head){
           temp = temp.next;
       }
       temp.next = node;
       node.next = head;
       return head;
    }
  
  /*
  Approach 2: Insert new node after head node
  then swap the data of head node and head's next node(new node)
  now, temp is our new head
  Time Complexity : O(1)
  */

    static Node insertAtEndO_1(Node head, int x) {
        Node node = new Node(x);
        if(head == null){
            node.next = node;
            return node;
       }
       
       //insert after head;
       node.next = head.next;
       head.next = node;
       
       //swap head and head's next data
       int t = head.data;
       head.data = node.data;
       node.data = t;
       
       //now node is new head;
       return node;
    }

}

/*
Insert 10,20,30,40,50 in CLL at end
CLL :
10 20 30 40 50 
*/
