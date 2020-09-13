package pratice.week1.second;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-09 22:21
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}
