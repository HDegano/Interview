package Tree;

import Core.TreeNode;

/**
 * Created by HDegano on 6/17/2015.
 */
public class SymmetricTree{

    public boolean isSymmetric(TreeNode root) {

        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode p, TreeNode q){

        if(p == null && q == null) return true;

        if(p == null || q == null) return false;

        if(p.val != q.val) return false;

        return isSymmetric(p.right, q.left) && isSymmetric(p.left, q.right);
    }

}