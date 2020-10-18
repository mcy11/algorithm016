package pratice.week5;

/**
 * @author yd
 * @version 1.0
 * @date 2020-10-16 11:34
 */
public class MaxProduct {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, iMin = 1, iMax = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0){
                int temp = iMax;
                iMax = iMin;
                iMin = temp;
            }
            iMax = Math.max(nums[i], iMax * nums[i]);
            iMin = Math.min(nums[i], iMin * nums[i]);
            max = Math.max(max, iMax);
        }
        return max;
    }
}
