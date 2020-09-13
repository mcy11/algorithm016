package homework.week1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-13 14:09
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> paramMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(paramMap.containsKey(temp)){
                return new int [] {paramMap.get(temp), i};
            }
            paramMap.put(nums[i], i);
        }
        return null;
    }
}
