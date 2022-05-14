public class BalancedTreeCheckO_N2 {

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
		
		// Time complexity - O(N^2)
		public static boolean checkBalancedTree(Node root) {
			if(root == null) {
				return true;
			}
			
			//leaf node
			if(root.left == null && root.right == null) {
				return true;
			}
			
			System.out.println("--------root--------"+ root.data);
			int left = calHeight(root.left);
			int right = calHeight(root.right);
			System.out.println("left : "+left);
			System.out.println("right : "+right);
			if(Math.abs(left - right) > 1) {
				System.out.println(root.data);
				return false;
			}
			
			return checkBalancedTree(root.left) && checkBalancedTree(root.right);
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
		
		System.out.println(BinaryTree.checkBalancedTree(root));
	}
}
