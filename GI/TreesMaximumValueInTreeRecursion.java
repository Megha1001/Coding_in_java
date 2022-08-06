import java.util.*;



class FindMaxValue{
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
	static int value = Integer.MIN_VALUE;
	public static void main(String [] args){
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right  = new Node(50);

		System.out.println("Maximum value in given tree is  "+findMax(root));
}

public static int findMax(Node root){
	if(root == null) return value;
	else if(root.key > value) value = root.key;
	return Math.max(findMax(root.left), findMax(root.right));
}
}
