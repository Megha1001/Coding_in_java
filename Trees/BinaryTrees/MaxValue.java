public class MaxValue {
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
		public static int max = Integer.MIN_VALUE;
		
		// Time Complexity : O(n), auxiliary space :  θ(height + 1)
		public static int maxValue(Node node) {
			
			if(node == null) {
				return max;
			}
			
			return Math.max(maxValue(node.left), Math.max(maxValue(node.right), node.data));
		}
	}

	public static void main(String[] args) {
		Node node = new Node(10);
		node.left = new Node(20);
		node.left.left = new Node(40);
		node.right = new Node(30);
		
		System.out.println("Max value : "+ BinaryTree.maxValue(node));

	}

}
