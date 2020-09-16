package pratice.week2.first;

import model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-15 15:59
 */
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrder(root, res);
        return res;
    }

    public void inOrder(TreeNode root, List<Integer> res){
        if(root != null){
            inOrder(root.left, res);
        }
        res.add(root.val);
        if(root.right != null){
            inOrder(root.right, res);
        }
    }
}
