package pratice.week3.third;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-24 16:29
 */
public class MinDepth {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);

        return root.left == null || root.right == null ? left + right + 1 : Math.min(left, right) + 1;
    }
}
