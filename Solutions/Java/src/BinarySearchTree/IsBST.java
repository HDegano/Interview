package BinarySearchTree;

import Core.TreeNode;

/**
 * Created by HDegano on 6/17/2015.
 */
/*
Lets take advantage of a BST node property check that the left and right child
is within the range of its parent
*/
public class IsBST {
    public boolean isValidBST(TreeNode root) {

        if(root == null) return true;

        return isValidBST(root, (long)Integer.MIN_VALUE, (long)Integer.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode root, long min, long max){
        if(root == null) return true;

        if(root.val < min || root.val > max) return false;

        return isValidBST(root.left, min, (long)root.val - 1) &&
                isValidBST(root.right,(long)root.val + 1, max);
    }
}