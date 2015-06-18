package BinarySearchTree;

import Core.TreeNode;

import java.util.Stack;

/**
 * Created by HDegano on 6/17/2015.
 */
/*
We need to build up on Inorder iterative
We can use a queue but that would take O(n) space
we can instead only push when we need to and only take up O(lgh), h is height
*/
public class BSTIterator {
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {

        stack = new Stack<TreeNode>();

        TreeNode current = root;

        while(current != null){
            stack.push(current);
            current = current.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {

        TreeNode top = stack.pop();

        if(top.right != null){

            TreeNode current = top.right;
            while(current != null){
                stack.push(current);
                current = current.left;
            }
        }

        return top.val;
    }
}
