package BST;

public class MinDistance {
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

    Integer result = Integer.MAX_VALUE;
    Integer previous = null;

    public int minDistanceBST(TreeNode root) {

        if (root.left != null) {
            minDistanceBST(root.left);
        }

        if (previous != null) {
            result = Math.min(result, root.val - previous);
        }

        previous = root.val;

        if (root.right != null) {
            minDistanceBST(root.right);
        }

        return result;
    }

}

