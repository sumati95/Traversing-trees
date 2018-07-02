public class SearchNode {
    public static void main(String[] args) {
        TreeNode4 root = new TreeNode4(1);
        root.left = new TreeNode4(2);
        root.right = new TreeNode4(3);
        root.left.left = new TreeNode4(4);
        root.left.left.right = new TreeNode4(5);
        root.left.left.left = new TreeNode4(8);
        root.left.left.left.right = new TreeNode4(9);
        root.right.left = new TreeNode4(6);
        root.right.right = new TreeNode4(7);
        root.right.right.right = new TreeNode4(11);
        System.out.println(searchN(root, 00));
    }

    static int searchN(TreeNode4 root, int search) {
        if (root.value == search) {
            return 1;
        }
        if (root.left != null) {
            return searchN(root.left, search);
        }
        if (root.right != null) {
            return searchN(root.right, search);
        }
        return 0;
    }
}

class TreeNode4 {
    int value;
    TreeNode4 left, right;
    TreeNode4(int v) {
        value = v;
    }
}
