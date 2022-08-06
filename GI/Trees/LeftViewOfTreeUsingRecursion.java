import java.util.*;



class LeftViewOfTreeUsingRecursion{
    public static int maxLevel = 0; // Visited Level
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

	public static void main(String [] args){
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right  = new Node(50);

		System.out.println("Left view of given tree is :  ");
		printLeftView(root, 1);
}

    public static void printLeftView(Node root, int level){ //current level
        if(root == null) return;
        if(maxLevel < level){
            System.out.print(root.key+" ");
            maxLevel = level;
        }
        printLeftView(root.left, level +1);
        printLeftView(root.right, level +1);
    }
}


