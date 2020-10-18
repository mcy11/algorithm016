package pratice.week5;

/**
 * @author yd
 * @version 1.0
 * @date 2020-10-16 11:26
 */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if(sum > 0){
                sum = sum + num;
            }else {
                sum = num;
            }
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}
