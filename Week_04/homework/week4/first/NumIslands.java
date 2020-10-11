package homework.week4.first;

/**
 * @author yd
 * @version 1.0
 * @date 2020-10-09 11:06
 */
public class NumIslands {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    private int m;

    private int n;

    public int numIslands(char[][] grid) {
        int count = 0;
        m = grid.length;
        if(m == 0){
            return 0;
        }
        n = grid[0].length;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    DFSMarking(grid, i , j);
                    count++;
                }
            }
        }
        return count;
    }

    private void DFSMarking(char[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '0';
        DFSMarking(grid, i + 1, j);
        DFSMarking(grid, i - 1, j);
        DFSMarking(grid, i, j + 1);
        DFSMarking(grid, i, j - 1);
    }
}
