package pratice.week3.sec;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-22 15:26
 */
public class IsValidBST {

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
