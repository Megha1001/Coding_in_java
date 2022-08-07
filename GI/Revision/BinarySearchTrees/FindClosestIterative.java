class FindClosestIterative {
    public static Node temp;
    static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(11);
        root.left = new Node(9);
        root.right = new Node(14);
        root.left.left = new Node(9);
        root.right.left = new Node(10);
        root.right.left = new Node(12);
        root.right.right = new Node(16);
        System.out.println("Find closest of 15 : ");
        Node closestNode = findClosest(root, 15);
        if (closestNode != null) {
            System.out.println(closestNode.key);
        } else {
            System.out.println("Closest doesn't exists.");
        }

        // 	inOrder(root);
    }

    //Iterative approach
    public static Node findClosest(Node root, int x) {
        Node res = null;
        while (root != null) {
            if (root.key == x) {
                return root;
            } else if (root.key > x) {
                root = root.left;
            } else {
                res = root;
                root = root.right;
            }
        }
        return res;
    }

    //printing
    public static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.println(root.key);
        inOrder(root.right);
    }

}
