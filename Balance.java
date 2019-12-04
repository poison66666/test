import sun.reflect.generics.tree.Tree;

public class Balance {
    public boolean isBalance(TreeNode root){
        //判断根元素是否为null
        if(root == null){
            return true;
        }
        //获取左边子树高度
        int leftHeight = getTreeHeight(root.left);
        int rightHeight = getTreeHeight(root.right);

        //差大于1表示不平衡
        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }

        //isBalance是否平衡
        return isBalance(root.left) && isBalance(root.right);
    }

    private int getTreeHeight(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(getTreeHeight(root.left),getTreeHeight(root.right))+1;
    }
}



/*
public class Balance {
    public int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.max(left,right)+1;
    }
    public boolean isBalance(TreeNode root){
        if(root ==null){
            return true;
        }
        if(!isBalance(root.left)){
            return false;
        }
        if(!isBalance(root.right)){
            return false;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        int diff = left - right;
        if(Math.abs(diff) <= 1){
            return true;
        }
        return false;
    }
}
*/
