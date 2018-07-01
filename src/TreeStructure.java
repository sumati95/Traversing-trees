
public class TreeStructure {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.left.left.right = new TreeNode(9);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(10);
        preOrder(root);
    }

    static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    static void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data + " ");
        }
    }

    static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data + " ");
            inOrder(root.left);
        }
    }
}

class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int d) {
        data = d;
    }
}
