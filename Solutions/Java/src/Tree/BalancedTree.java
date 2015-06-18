package Tree;

import Core.TreeNode;

/**
 * Created by HDegano on 6/17/2015.
 */
public class BalancedTree {

    public boolean IsBalanced(TreeNode root) {
        if(root == null) return true;

        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode root){

        if(root == null) return 0;

        int lHeight = checkHeight(root.left);

        if(lHeight == -1) return -1;

        int rHeight = checkHeight(root.right);

        if(rHeight == -1) return -1;

        if(Math.abs(rHeight - lHeight) > 1) return -1;

        return Math.max(rHeight, lHeight) + 1;
    }

}
