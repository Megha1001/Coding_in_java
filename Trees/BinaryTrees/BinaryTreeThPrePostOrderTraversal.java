
public class BinaryTreeThPrePostOrderTraversal {

	public static int preIndex = 0;
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = this.right = null;
		}
	}
	
	//Time complexity : O(N^2)
	public static Node buildTree(int[] in, int [] pre, int start, int end) {
		
		// For leaf node child
		if(start > end) {
			return null;
		}
		
		// Pre-Order traversal
		Node root = new Node(pre[preIndex++]);
		int index = -1;
		for(int i = start ; i <= end; i++) {
			if(in[i] == root.data) {
				index = i;
				break;
			}
		}
		
		root.left = buildTree(in, pre, start, index - 1);
		root.right = buildTree(in, pre, index + 1, end);
		
		return root;
	}
	
	public static void main(String[] args) {
		int [] inOrder = {20,10,40,30,50};
		int [] preOrder = {10,20,30,40,50};
		
		Node root = buildTree(inOrder, preOrder, 0, inOrder.length -1);
		System.out.println(root.data);

	}

}
