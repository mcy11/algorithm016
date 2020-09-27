package pratice.week3.third;

import pratice.week3.first.IsValidBST;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-24 16:20
 */
public class IsValidBTS {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private long min = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        if(!isValidBST(root.left)){
            return false;
        }
        if(root.val <= min){
            return false;
        }
        min = root.val;
        return isValidBST(root.right);
    }
}
