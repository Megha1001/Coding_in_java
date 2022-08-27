class ReverseDLL {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head = insertBegin(head, 2);
        head = insertBegin(head, 3);
        head = insertBegin(head, 4);
        System.out.println("Given DLL");
        printDLL(head);
        System.out.println("\nReversed DLL :");
        head = reverseDLL(head);
        printDLL(head);
    }

    static Node reverseDLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            //swapping
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            // point to next ;) since next is not previous
            curr = curr.prev;
        }
        return prev.prev;

    }
    static Node insertBegin(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        if (head != null) {
            head.prev = temp;
        }
        head = temp;
        return head;
    }

    static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

/*
Given DLL
4 3 2 1 
Reversed DLL :
1 2 3 4 
*/
