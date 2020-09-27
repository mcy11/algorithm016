package homework.week3;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-27 11:44
 */
public class BulidTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode buildTreeHelper(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        if (pStart == pEnd) {
            return null;
        }
        int rootVal = preorder[pStart];
        TreeNode root = new TreeNode(rootVal);
        //在中序遍历中找到根节点的位置
        int iRootIndex = 0;
        for (int i = iStart; i < iEnd; i++) {
            if (rootVal == inorder[i]) {
                iRootIndex = i;
                break;
            }
        }
        int leftNum = iRootIndex - iStart;
        root.left = buildTreeHelper(preorder, pStart + 1, pStart + leftNum + 1, inorder, iStart, iRootIndex);
        root.right = buildTreeHelper(preorder, pStart + leftNum + 1, pEnd, inorder, iRootIndex + 1, iEnd);
        return root;
    }
}
