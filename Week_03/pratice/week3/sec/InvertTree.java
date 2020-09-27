package pratice.week3.sec;


/**
 * @author yd
 * @version 1.0
 * @date 2020-09-22 15:23
 */
public class InvertTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode invertTree(TreeNode root) {
        TreeNode head = root;
        invert(root);
        return head;
    }

    private void invert(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
}
