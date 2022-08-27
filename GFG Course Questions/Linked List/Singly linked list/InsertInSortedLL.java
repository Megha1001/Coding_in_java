class InsertInSortedLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtHead(head, 40);
        head = insertAtHead(head, 30);
        head = insertAtHead(head, 20);
        head = insertAtHead(head, 10);

        System.out.println("Given LL is ");
        printLL(head);

        System.out.println("Insert 35");
        head = insertInSort(head, 35);
        printLL(head);

    }
  
    //Time Complexity : O(N)
    static Node insertInSort(Node head, int x) {
        Node node = new Node(x);
        if (head == null) {
            return node;
        }
        // insert as first node in non-empty ll
        if (x < head.data) {
            node.next = head;
            return node;
        }

        // insert in middle of at end;
        //find the largest smallest node (here 30)
        Node temp = head;
        while (temp.next != null && temp.next.data < x) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;

        return head;
    }
    static void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static Node insertAtHead(Node head, int x) {
        Node node = new Node(x);
        if (head == null) {
            return node;
        }
        node.next = head;
        return node;
    }


}
