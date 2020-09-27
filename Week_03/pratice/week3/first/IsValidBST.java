package pratice.week3.first;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-21 14:44
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
          if (root.val <= min){
              return false;
          }
          min = root.val;
          return isValidBST(root.right);
    }
}
