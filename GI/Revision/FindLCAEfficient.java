/* This logic works only when both the nodes are present in tree, otherwise it will return reference to the existing node
*/
class FindLCAEfficient{
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
	Node root = new Node(10);
	root.left = new Node(20);
	root.right = new Node(30);
	root.right.left = new Node(40);
	root.right.right = new Node(50);
	Node lca = findLCA(root, 20,50);
	System.out.println(“The LCA of given values is : ”+lca.key);

}

public static Node findLCA(Node root, int n1, int n2){
	if(root == null) return null;
	if(root.key == n1 || root.key == n2) return root;
	
	Node lh1 = findLCA(root.left, n1, n2);
	Node lh2 = findLCA(root.right, n1, n2);
	
	if(lh1 != null && lh2 != null) return root;
	
	if(lh1 != null) return lh1;
	else return lh2;
}
}
