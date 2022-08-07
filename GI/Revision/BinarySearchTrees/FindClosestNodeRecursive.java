
/* Closest Node : Node whose value is greatest smallest or equal to the given value
*/
class FindClosestNodeRecursive{
    public static Node temp ;
	static class Node{
		int key;
		Node left;
		Node right;
		
		Node(int key){
			this.key = key;
			this.left = null;
			this.right = null;
}
}

public static void main(String[] args){
	Node root = new Node(11);
	root.left = new Node(9);
	root.right = new Node(14);
	root.left.left = new Node(9);
	root.right.left = new Node(10);
	root.right.left = new Node(12);
	root.right.right = new Node(16);
	System.out.println("Find closest of 15 : " );
	Node closestNode = findClosest(root,15);
	if(closestNode != null){
	    System.out.println(closestNode.key);
	}else{
	    System.out.println("No reference exists");
	}
	
// 	inOrder(root);
}

//Recursive approach
static Node findClosest(Node root, int x){
    if(root == null) return null;
    //inorder traversal
    findClosest(root.left, x);
    if(x == root.key){
        temp = root;
        return temp;
    }else if(root.key < x && temp == null){
        temp = root; // no need to return since we can find better value in right half
        // return temp;
    }else if(root.key < x){ // temp != null
        if(temp.key < root.key){
            temp = root;// no need to return since we can find better value in right half
            // return temp; 
        }
    }
    
    findClosest(root.right,x);
    
    return temp;
}

//printing
public static void inOrder(Node root){
	if(root == null ) return;
	inOrder(root.left);
	System.out.println(root.key);
	inOrder(root.right);
}


}




