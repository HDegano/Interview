package BinarySearchTree;

import Core.TreeNode;

/**
 * Created by HDegano on 6/17/2015.
 */
public class SortedArrayToBST {

    public TreeNode SortedArrayToBST(int[] num) {
        return _sortedArrayToBST(num, 0, num.length - 1);
    }

    private TreeNode _sortedArrayToBST(int[] num, int lo, int hi){

        if(lo > hi) return null;

        int mid = lo + (hi - lo)/2;

        TreeNode root = new TreeNode(num[mid]);

        root.left = _sortedArrayToBST(num, lo, mid-1);
        root.right = _sortedArrayToBST(num, mid+1, hi);

        return root;

    }

}
