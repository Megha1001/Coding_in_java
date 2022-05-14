public class BalancedTreeO_N {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree{
		
		public static int calHeight(Node node) {
			if(node == null) {
				return 0;
			}
			return Math.max(calHeight(node.left), calHeight(node.right)) + 1;
		}
		
		// Time complexity - O(N)
		/* 
		 * Logic : If tree is unbalanced return -1 otherwise return height of the tree(>=0)
		 * 
		 */
		public static int isBalanced(Node root) {
			if(root == null) {
				return 0;
			}
      
			//check left subtree
			int leftHeight = isBalanced(root.left);
			if(leftHeight == -1) return -1;
			
			//check right subtree
			int rightHeight = isBalanced(root.right);
			if(rightHeight == -1) return -1;
			
			//check current node
			if(Math.abs(rightHeight - leftHeight) > 1) return - 1;
			else return Math.max(leftHeight, rightHeight) + 1;
		}
	}
	
	public static void main(String[] args) {
		Node root = new Node(3);
		root.left = new Node(4);
		root.right = new Node(8);
		root.left.left = new Node(5);
		root.left.right = new Node(9);
		root.right.right = new Node(7);
		root.right.right.left = new Node(6);
		
		int result = BinaryTree.isBalanced(root);
		if(result == -1) System.out.println(false);
		else System.out.println(true);
		
		System.out.println();
	}
}
