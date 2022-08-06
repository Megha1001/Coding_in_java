import java.util.*;

class CheckChildSumPropertyRecursive{

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
		root.left.left = new Node(40);
		root.left.right = new Node(50);

		System.out.println("is Child sum property exist ?: "+checkChildSumProperty(root));
}

public static boolean checkChildSumProperty(Node root){
	if(root == null) return true;
	if(root.left == null && root.right == null) return true;
	int sum = 0;
	if(root.left != null) sum += root.left.key;
	if(root.right !=null) sum += root.right.key;
	return (root.key == sum && checkChildSumProperty(root.left) && checkChildSumProperty(root.right));
}

}
