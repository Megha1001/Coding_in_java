//Question :

class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
	    Node temp = head_ref;
	    Node node = new Node(data);
	    int i  = 0;
		for( i = 0; i < pos && temp != null; i++){
		    temp = temp.next;
		}
		
		// invalid position to insert
		if(i != pos && temp == null){
		    return;
		}
		
		//insert in middle
		if(temp.next != null){
		    temp.next.prev = node;
		    node.next = temp.next;
		    node.prev = temp;
		    temp.next = node;
		}else{ // insert at end
		    temp.next = node;
		    node.prev = temp;
		}
	}
}
