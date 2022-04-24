class RecursiveWay {
    Node head;
    private int size;
    
    IterativeWay(){
        this.size = 0;
    }
    
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            ++size;
        }
    }
    
    // Add element at first position
    public void addAtFirst(String data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }
    
    // Add element at last position
    public void addAtLast(String data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        
        currNode.next = newNode;
    }
    
    
    // print element of linked list
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        
        Node currNode = head;
        while(currNode != null){ // removed .next to print last node
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        
        System.out.println("NULL");
        
    }
    
    
    // delete first element
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        
        head = head.next;
        --size;
    }
    
    // delete last element
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        
        --size;
        if(head.next == null){
            head = null;
            return;
        }
        
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    
    // to get size
    public int getSize(){
        return size;
    }
    
    public Node reverseRecursive(Node head){
        
        if(head == null || head.next == null){
            return head;
        }
        
        Node newHead  = reverseRecursive(head.next);
        
        head.next.next = head;
        head.next = null;
        
        return newHead;
        
    }
    
    public static void main(String [] args){
        RecursiveWay list = new RecursiveWay();
        
        list.addAtLast("1");
        list.addAtLast("2");
        list.addAtLast("3");
        list.addAtLast("4");
        list.printList();
        
        list.head = list.reverseRecursive(list.head);
        list.printList();
        
    }
}
