package Hash;

import java.util.Stack;

public class Iterator {

    Stack<TreeNode> stack = new Stack<>();

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public Iterator(TreeNode root) {
        leftToStack(root);
    }

    public void leftToStack(TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    public int next() {
        TreeNode currentNode = stack.pop();
        leftToStack(currentNode.right);
        return currentNode.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
