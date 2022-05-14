public class LevelOrderTraversalBruteForce {
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class BinaryTree{
		
		static int idx = -1;
		
		public static Node buildTree(int [] nodes) {
			idx++;
			if(nodes[idx] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			
			return newNode;
		}
		
		public static int calcHeight(Node root) {
			if(root == null) {
				return 0;
			}
			return Math.max(calcHeight(root.left), calcHeight(root.right)) + 1;
		}
		
		public static void printAtKDist(Node node, int h) {
			if(node == null) {
				return;
			}
			if(h == 0) {
				System.out.print(node.data+" ");
			}
			printAtKDist(node.left, h -1);
			printAtKDist(node.right, h -1);
			
		}
	}
	public static void main(String[] args) {
		int [] nodes = {1, 2, 4, -1, -1, 5, -1,-1, 3, -1, 6, -1, -1 };
		Node root = BinaryTree.buildTree(nodes);
		System.out.println(root.data);
		int height = BinaryTree.calcHeight(root);
		System.out.println("height : "+height);
		for(int i = 0; i < height; i++) {
			BinaryTree.printAtKDist(root, i);
		}
	}

}
