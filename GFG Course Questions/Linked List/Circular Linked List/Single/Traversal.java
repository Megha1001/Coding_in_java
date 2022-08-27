class Traversal {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        
        System.out.println("CLL : ");
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

    
}

/*
OUTPUT 
CLL : 
10 20 30 
*/
