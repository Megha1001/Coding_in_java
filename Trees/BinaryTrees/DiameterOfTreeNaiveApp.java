public class DiameterOfTreeNaiveApp {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = this.right = null;
		}
	}

	public static int height(Node node) {

		if (node == null)
			return 0;

		return 1 + Math.max(height(node.left), height(node.right));
	}

  //Time Complexity : O(n^2)
	public static int diameter(Node root) {

		if (root == null)
			return 0;

		int d1 = 1 + height(root.left) + height(root.right);

		int d2 = diameter(root.left);
		int d3 = diameter(root.right);

		return Math.max(d1, Math.max(d2, d3));

	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.left.left = new Node(50);
		root.right.right = new Node(60);
		root.right.right.right = new Node(70);

		System.out.println("Diameter of tree : " + diameter(root));
	}

}
