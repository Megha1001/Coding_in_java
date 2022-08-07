// link for the question  : https://practice.geeksforgeeks.org/batch-problems/mirror-tree/0/?track=DSASP-Tree&batchId=154
class ConvertIntoMirror {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        convertIntoMirror(node);
    }
    
    public Node convertIntoMirror(Node node){
        if(node == null) return node;
        
        Node left = convertIntoMirror(node.left);
        Node right = convertIntoMirror(node.right);
        
        node.left = right;
        node.right = left;
        
        return node;
    }
}
