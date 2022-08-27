
class InsertAtBegin {
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
        System.out.println("Insert 10,20,30 in CLL at beginning");
        head = insertAtBeginO_N(head, 10);
        head = insertAtBeginO_1(head, 20);
        head = insertAtBeginO_1(head, 30);
        System.out.println("CLL :");
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
  
    static Node insertAtBeginO_N(Node head, int x) {
        Node node = new Node(x);
        if (head == null) {
            node.next = node;
            return node;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = head;
        return head;
    }
  
  /*
  Approach 1 : Insert new node after head node
  then swap the data of head node and head's next node(new node)
  Time Complexity : O(1)
  */

    static Node insertAtBeginO_1(Node head, int x) {
        Node node = new Node(x);
        if (head == null) {
            node.next = node;
            return node;
        }

        //insert after head
        node.next = head.next;
        head.next = node;

        //swap the data of head and head's next(new node)
        int t = head.data;
        head.data = node.data;
        node.data = t;

        return head;
    }

}
