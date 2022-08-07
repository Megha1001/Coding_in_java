class FindCeilIterative {
    public static Node temp= null;
    static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(30);
        System.out.println("Find ceil of 4 : ");
        Node ceilNode = findCeil(root, 4);
        if (ceilNode != null) {
            System.out.println(ceilNode.key);
        } else {
            System.out.println("Ceiling value doesn't exists.");
        }

        //inOrder(root);
    }

    //Recursive approach
   	public static Node findCeil(Node root, int x){
   	    
	    if(root == null) return null;
	    //in-order traversal
	    findCeil(root.left, x);
	    if(x == root.key){
	        temp = root;
		    return temp;
        }else if(x < root.key){
    	    if(temp == null){
    	        temp = root;
    	    }else{
    	        if(temp.key > root.key){
    	            temp = root;
    	        }
    	    }
        }
	    findCeil(root.right,x);
	    return temp;
	
    }


    //printing
    public static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.println(root.key);
        inOrder(root.right);
    }

}


