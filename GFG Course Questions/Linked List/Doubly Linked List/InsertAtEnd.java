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
        Node head = new Node(1);
        head = insertBegin(head, 2);
        head = insertBegin(head, 3);
        head = insertBegin(head, 4);
        System.out.println("Given DLL");
        printDLL(head);
        System.out.println("Modified DLL :");
        head = insertAtEnd(head, 5);
        printDLL(head);
    }

    static Node insertAtEnd(Node head, int data) {
        Node node = new Node(data);
        if (head == null) {
            return null;
        }

        Node temp = head;
        //traverse upto last node
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
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
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}

/*
OUTPUT
java -cp /tmp/0NSSRVRTG5 DoublyLLImpl
Given DLL
4 
3 
2 
1 
Modified DLL :
4 
3 
2 
1 
5 

*/
