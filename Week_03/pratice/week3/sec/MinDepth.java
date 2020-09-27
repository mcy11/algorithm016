package pratice.week3.sec;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-22 15:39
 */
public class MinDepth {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int minDepth(TreeNode root) {
        //越过叶子节点
        if(root == null){
            return 0;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        return root.left == null || root.right == null ? leftDepth + rightDepth + 1 : Math.min(leftDepth, rightDepth) + 1;
    }
}
