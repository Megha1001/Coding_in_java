
class BinarySearchTreeOperations{
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
	Node root = new Node(15);
	root.left = new Node(5);
	root.right = new Node(20);
	root.left.left = new Node(3);
	root.right.left = new Node(18);
	root.right.left.left = new Node(16);
	root.right.right = new Node(80);
	System.out.println("Search Opertation : " );
	System.out.println(" is value 16 present in BST ?  "+searchRec(root, 16));
    	System.out.println( "is value 16 present in BST ?  "+searchIte(root, 16));
	System.out.println("Insert Opertation : insert 19" );
	insertRec(root, 19);
	inOrder(root);
    	insertIte(root, 81);
    	inOrder(root);
	System.out.println("delete Opertation : insert 19" );
	delete(root,19);
	inOrder(root);
}

//printing
public static void inOrder(Node root){
	if(root == null ) return;
	inOrder(root.left);
	System.out.println(root.key);
	inOrder(root.right);
}


// Approach : Recursive
	static boolean  searchRec(Node root, int key){
		if(root == null) return false;
		else if(root.key == key) return true;
		else if(root.key > key){
			return searchRec(root.left, key);
        }else{
	       return searchRec(root.right, key);
        }
    }





public static Node insertRec(Node root, int x){
	if(root == null){
		return new Node(x);
}
if(root. key > x){
	root.left = insertRec(root.left , x);
}
else if(root.key < x){
	root.right = insertRec(root.right, x);
}
return root;
}


// Approach : Iterative
    static boolean searchIte(Node root, int key){
	    while( root != null){
		    if(root.key == key) return true;
		    else if(root.key > key) {
                root = root.left;
            }
		    else {
                root = root.right;
            }
        }
        return false;
    }
    
    
public static Node insertIte(Node root, int x){
	Node temp = new Node(x);
	Node parent = null, curr = root;
	while(curr != null){
		parent = curr;
		
		if(curr.key > x){
			curr = curr.left;
}
else if(curr.key < x){
	curr = curr.right;
}
else
	return root;
}
//Corner case -- > hen empty tree is passed
if(parent == null){
	return temp;
}
else if (parent.key > x){
	parent.left = temp;
}else{
	parent.right = temp;
}
return root;
}


public static Node delete(Node root, int x){
	if(root == null) return null;
	if(root.key > x){
		root.left = delete(root.left, x);
}
else if(root.key < x ){
	root.right = delete(root.right, x);
}


//equal
else{
	// only left child exists or no child exists/leaf node
	if(root.right == null) return root.left;
		
		//only right child exists
		else if(root.left == null) return root.right;

		//both child exists
		else{
			Node succ = getSucc(root);
			root.key = succ.key;
			root.right = delete(root.right, succ.key);
}
}

return root;
}// end of delete

	public static Node getSucc(Node root){
	Node curr = root.right;
	while(curr != null && curr.left != null){
	curr = curr.left;
}
return curr;
}

}




