package homework.week1;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-13 12:05
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int q1 = 0;
        int q2 = 1;

        for (; q2< nums.length;) {
            if(nums[q1] != nums[q2]){
                nums[++q1] = nums[q2++];
            }else {
                q2++;
            }
        }

        return q1 + 1;
    }

}
