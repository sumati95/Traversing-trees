public class MaxNode {
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.left.left = new TreeNode1(4);
        root.left.left.right = new TreeNode1(5);
        root.left.left.left = new TreeNode1(8);
        root.left.left.left.right = new TreeNode1(9);
        root.right = new TreeNode1(3);
        root.right.left = new TreeNode1(6);
        root.right.right = new TreeNode1(7);
        root.right.right.right = new TreeNode1(10);
        System.out.println(maxFind(root));
    }

    static int maxFind(TreeNode1 root) {
        int max ;
        if (root == null) {
            return 0;
        }
        int lmax = maxFind(root.left);
        int rmax = maxFind(root.right);
        if (lmax > rmax) {
            max = lmax;
        }
        else {
            max = rmax;
        }
        if (root.value > max) {
            max = root.value;
        }
        return max;
    }
}

class TreeNode1 {
    int value;
    TreeNode1 left, right;
    TreeNode1(int v) {
        value = v;
    }
}
