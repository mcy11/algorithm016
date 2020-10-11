package homework.week4.first;

/**
 * @author yd
 * @version 1.0
 * @date 2020-10-10 09:56
 */
public class CanJump {

    public boolean canJump(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if(i > k){
                return false;
            }
            k = Math.max(k, nums[i] + i);
        }
        return true;
    }

    public boolean canJump2(int[] nums) {
        int last = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if(i + nums[i] >= last){
                last = i;
            }
        }
        return last == 0;
    }
}
