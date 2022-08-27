//************ ASSUMPTION : NUM OF NODES IN LL >= K ******************

class DeleteKthNode {
  
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

        System.out.println("\nCLL after deleting 2nd node");
        head = deleteKNode(head, 2);
        printCLL(head);
        System.out.println("\nCLL after deleting 1st node");
        head = deleteKNode(head, 1);
        printCLL(head);
    }

    // Time Complexity : O(N)
    static Node deleteKNode(Node head, int k) {
        if (head == null) {
            return null;
        }

        if (k == 1) {
            return deleteHeadO_1(head);
        }

        Node curr = head;
        // to reach at k-1 position (next to this is the node that we want to delete)
        for (int i = 0; i < k - 2; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return head;

    }

    // Time Complexity : O(1)
    static Node deleteHeadO_1(Node head) {
        //single node
        if (head.next == head) {
            return null;
        }

        head.data = head.next.data;
        head.next = head.next.next;

        return head;
    }
    //Time Complexity : O(N)
    static void printCLL(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        for (Node r = head.next; r != head; r = r.next) {
            System.out.print(r.data + " ");
        }
    }

    //Time Complexity : O(1)
    static Node insertAtEndO_1(Node head, int x) {
        Node node = new Node(x);
        if (head == null) {
            node.next = node;
            return node;
        }
        //insert after head
        node.next = head.next;
        head.next = node;

        //swap
        int t = head.data;
        head.data = node.data;
        node.data = t;
        //new head
        return node;
    }


}

/*

Insert 10,20,30,40,50 in CLL at end
CLL :10 20 30 40 50 
CLL after deleting 2nd node
10 30 40 50 
CLL after deleting 1st node
30 40 50 
*/
