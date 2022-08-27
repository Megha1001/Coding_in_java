class DeleteLastNode {
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
        System.out.println("Given DLL :");
        printDLL(head);
        System.out.println("\nModified DLL :");
        head = deleteLastNode(head);
        printDLL(head);
    }

    static Node deleteLastNode(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        // atleast two nodes
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        return head;
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
OUTPUT
Given DLL :4 3 2 1 
Modified DLL :
4 3 2 
*/
