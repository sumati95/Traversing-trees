public class TreeTraversing {
    public static void main(String[] args) {
        TreeNode2 root = new TreeNode2(1);
        root.left = new TreeNode2(2);
        root.left.left = new TreeNode2(4);
        root.left.left.right = new TreeNode2(5);
        root.left.left.left = new TreeNode2(8);
        root.left.left.left.right = new TreeNode2(9);
        root.right = new TreeNode2(3);
        root.right.left = new TreeNode2(6);
        root.right.right = new TreeNode2(7);
        root.right.right.right = new TreeNode2(10);
        preOrder(root);
        postOrder(root);
        inOrder(root);
    }

    static void preOrder(TreeNode2 root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    static void postOrder(TreeNode2 root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value + " ");
        }
    }

    static void inOrder(TreeNode2 root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }
}

class TreeNode2 {
    int value;
    TreeNode2 left, right;
    TreeNode2(int v) {
        value = v;
    }
}