package homework.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-16 15:35
 */
public class PostOrder {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        post(root, res);
        return res;
    }

    private void post(Node root, List<Integer> res){
        if(root.children != null && root.children.size() != 0){
            for (int i = 0; i < root.children.size(); i++) {
                post(root.children.get(i), res);
            }
        }
        res.add(root.val);
    }
}
