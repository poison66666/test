
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
/*
public class Main11 {
    public void Mirror(TreeNode root) {
        TreeNode tmp = null;
        if (root != null) {
            tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            if (root.left != null) {
                Mirror(root.left);
            }
            if (root.right != null) {
                Mirror(root.right);
            }
        }
    }
}*/

public class Main11 {
    public void Mirror(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left == null || root.right == null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left != null){
            Mirror(root.left);
        }
        if(root.right != null){
            Mirror(root.right);
        }
    }
}