package homework.week2;

import model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-16 15:22
 */
public class PreOrderTraversal {

    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        preOrder(root, res);
        return res;
    }

    public void preOrder(TreeNode root, List<Integer> res){
        res.add(root.val);
        if(root.left != null){
            preOrder(root.left, res);
        }
        if(root.right!= null){
            preOrder(root.right, res);
        }
    }
}
