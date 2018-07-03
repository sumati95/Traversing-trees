public class Bst {
    public static void main(String[] args) {
        TreeNode6 root  = new TreeNode6(50);
        Bst bst = new Bst();
        bst.insertNode(root, 60);
        bst.insertNode(root, 30);
        bst.insertNode(root, 20);
        bst.insertNode(root, 10);
        bst.insertNode(root, 610);
        bst.insertNode(root, 160);
        bst.insertNode(root, 260);
        bst.insertNode(root, 960);
        bst.insertNode(root, 560);
        bst.insertNode(root, 600);
        bst.insertNode(root, 690);
        bst.insertNode(root, 5);
        print(root);
    }

    static void print(TreeNode6 root) {
        if (root != null) {
            print(root.left);
            System.out.println(root.value + " ");
            print(root.right);
        }
    }

    void insertNode(TreeNode6 root, int data) {
        TreeNode6 ptr = root;
        TreeNode6 parent = null;
        while (ptr != null) {
            parent = ptr;
            if (ptr.value <= data) {
                ptr = ptr.right;
            } else {
                ptr = ptr.left;
            }
        }
        if (parent.value <= data) {
            parent.right = new TreeNode6(data);
        } else {
            parent.left = new TreeNode6(data);
        }
    }
}

class TreeNode6 {
    int value;
    TreeNode6 left, right;
    TreeNode6(int v) {
        value = v;
    }
}
