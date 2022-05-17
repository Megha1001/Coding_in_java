public class CountOfNodesInCBT {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = this.right = null;
		}
	}

	public static int countNodes(Node node) {
		
		if(node == null) return 0;
		
		return 1 + countNodes(node.left) + countNodes(node.right);
	}
	
	public static int countNodesOfCompBinaryTree(Node node) {
		
		int lh = 0, rh = 0;
		if(node == null) {
			return 0;
		}
		
		Node curr = node;
		while(curr != null) {
			++lh;
			curr = curr.left;
		}
		
		curr = node;
		while(curr != null) {
			++rh;
			curr = curr.right;
		}
		
		if(lh == rh) {
			return (int) (Math.pow(2, lh) -1);
		}
		
		return 1 + countNodes(node.left) + countNodes(node.right);
	}
	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		
		//Approach -1  - Time complexity : O(n^2)
		System.out.println("Count of nodes : "+countNodes(root));
		
		
		//Approach -2 - Time complexity : O(n)
		System.out.println("Count of nodes through efficient solution : " +countNodesOfCompBinaryTree(root));
		
	}

}
