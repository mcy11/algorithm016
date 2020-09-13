package pratice.week1.third;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-10 15:27
 */
public class MaxArea {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j;){
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            max = Math.max(max, (j -  i + 1) * minHeight);
        }
        return max;
    }
}
