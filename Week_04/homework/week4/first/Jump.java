package homework.week4.first;

/**
 * @author yd
 * @version 1.0
 * @date 2020-10-10 10:27
 */
public class Jump {

    public int jump(int[] nums) {
        int maxPosition = 0;
        int step = 0;
        int end = 0;

        for (int i = 0; i < nums.length - 1; i++){
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if(i == end){
                end = maxPosition;
                step++;
            }
        }

        return step;
    }
}
