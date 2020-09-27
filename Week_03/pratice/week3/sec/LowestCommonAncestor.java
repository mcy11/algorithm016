package pratice.week3.sec;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-22 15:44
 */
public class LowestCommonAncestor {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode cur, TreeNode p, TreeNode q) {
        if(cur == null || cur == p || cur == q){
            return cur;
        }

        TreeNode left = lowestCommonAncestor(cur.left, p, q);
        TreeNode right = lowestCommonAncestor(cur.right, p, q);

        if(left == null){
            return right;
        }

        if(right == null){
            return left;
        }

        return cur;
    }
}
