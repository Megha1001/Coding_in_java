class LL {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
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
        
        System.out.print("NULL");
        
    }
    
    
    public static void main(String [] args){
        LL list = new LL();
        
        list.addAtFirst("a");
        list.addAtFirst("b");
        list.addAtLast("c");
        
        list.printList();
        
    }
}
