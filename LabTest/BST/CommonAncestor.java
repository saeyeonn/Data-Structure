package BST;

public class CommonAncestor {
    class Node {
        int data;
        Node left;
        Node right;
    }

    public static Node lowestCommonAncestor(Node root, int v1, int v2) {
        if (v1 > v2) {
            int temp = v1;
            v1 = v2;
            v2 = temp;
        }

        while (root.data < v1 || root.data > v2) {
            if (root.data < v1) {
                root = root.right;
            } else if (root.data > v2){
                root = root.left;
            }
        }

        return root;
    }
}
