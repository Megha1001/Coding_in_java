//Question : https://practice.geeksforgeeks.org/problems/check-for-bst/1

public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        
        return checkForBST(root, min , max);
    }
    
   static boolean checkForBST(Node root, int min, int max){
        if(root == null){
            return true;
        }
        
        return (root.data > min &&
                root.data < max &&
                checkForBST(root.left,min, root.data) &&
                checkForBST(root.right, root.data, max));
        
    }
}
