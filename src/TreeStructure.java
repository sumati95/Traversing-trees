
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
        System.out.println(addNodes(root));
    }

    static int addNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lsum = addNodes(root.left);
        int rsum = addNodes(root.right);
        return root.data + lsum + rsum;
    }
}

class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int d) {
        data = d;
    }
}
