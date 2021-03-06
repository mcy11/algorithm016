package pratice.week1.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-08 22:43
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3){
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i] > 0){
                break;
            }
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0){
                    while (j < k && nums[k] == nums[--k]);
                }else if (sum < 0){
                    while (j < k && nums[j] == nums[++j]);
                }else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[k] == nums[--k]);
                    while (j < k && nums[j] == nums[++j]);
                }
            }
        }
        return res;
    }

}
