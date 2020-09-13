package homework.week1;

import java.lang.reflect.Array;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-13 12:34
 */
public class MergeTwoSortList {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last1 = m - 1;
        int last2 = n - 1;

        int last = nums1.length - 1;

        while (last1 >= 0 && last2 >= 0){
            nums1[last--] = nums1[last1] > nums2[last2] ? nums1[last1--] : nums2[last2--];
        }

        System.arraycopy(nums2, 0, nums1, 0, last2 + 1);
    }
}
