package homework.week1;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-08 16:01
 */
public class MoveZeros {

    public void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; j < nums.length;j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}
