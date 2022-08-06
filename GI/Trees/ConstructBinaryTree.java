class ConstructBinaryTree{
	public static int preIndex = 0;
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = left;
			this.right = right;
}
}

public static void main(String [] args){
	int[] in = {20,10,40,30,50};
	int[] pre ={10,20,30,40,50};
	Node root = constructBinaryTree(in, pre, 0, in.length -1);
	System.out.println(root.data);
}

public static Node constructBinaryTree(int[] in, int [] pre, int is, int ie){
		
	if(is > ie ) return null;

	Node root = new Node(pre[preIndex++]);
	// find index in inorder
	int inIndex =is;
	for(int i = is; i <= ie; i++){
		if(in[i] == root.data){
			inIndex = i;
			break;
}
}
root.left = constructBinaryTree(in, pre, is, inIndex -1);
root.right = constructBinaryTree(in, pre, inIndex+1, ie);

return root;
}
}
