package BinarySearchTree;

import Core.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by HDegano on 6/17/2015.
 */
public class InOrderTraversal {

    public List<Integer> inorderIterative(TreeNode root) {

        List<Integer> inOrderList = new ArrayList<Integer>();

        if(root == null) return inOrderList;

        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode current = root;

        while(current != null || !stack.isEmpty()){

            while(current != null){
                stack.push(current);
                current = current.left;
            }

            TreeNode top = stack.pop();

            inOrderList.add(top.val);

            current = top.right;
        }

        return inOrderList;
    }
}
