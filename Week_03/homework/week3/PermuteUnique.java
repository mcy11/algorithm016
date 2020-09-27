package homework.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-27 11:52
 */
public class PermuteUnique {

    boolean[] vis;

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> perm = new ArrayList<Integer>();
        vis = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums, ans, 0, perm);
        return ans;
    }

    public void backtrack(int[] nums, List<List<Integer>> res, int index, List<Integer> perm) {
        if (index == nums.length) {
            res.add(new ArrayList<Integer>(perm));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (vis[i] || (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1])) {
                continue;
            }
            perm.add(nums[i]);
            vis[i] = true;
            backtrack(nums, res, index + 1, perm);
            vis[i] = false;
            perm.remove(index);
        }
    }
}
