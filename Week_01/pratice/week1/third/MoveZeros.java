package pratice.week1.third;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-10 15:16
 */
public class MoveZeros {

    public void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }
}
