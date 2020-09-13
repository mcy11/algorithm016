package pratice.week1.third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-10 15:49
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3){
            return new ArrayList<>();
        }

        Arrays.sort(nums);

        List<List<Integer>> resultList = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            if(nums[i] > 0){
                break;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) while (j < k && nums[k] == nums[--k]);
                if (sum < 0) while (j < k && nums[j] == nums[++j]);
                if(sum == 0){
                    resultList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[k] == nums[--k]);
                    while (j < k && nums[j] == nums[++j]);
                }
            }
        }
        return resultList;
    }
}
