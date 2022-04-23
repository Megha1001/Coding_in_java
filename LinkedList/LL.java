class LL {
    Node head;
    private int size;
    
    LL(){
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
    
    public static void main(String [] args){
        LL list = new LL();
        
        list.addAtFirst("a");
        list.addAtFirst("b");
        
        list.addAtLast("c");
        list.addAtLast("d");
        list.addAtLast("e");
        
        list.printList();
        
        list.deleteFirst();
        list.printList();
        
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        
    }
}
