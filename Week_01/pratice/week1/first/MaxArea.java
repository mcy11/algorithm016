package pratice.week1.first;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-08 16:40
 */
public class MaxArea {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i != j;) {
            int minHeight = height[i] >= height[j] ? height[j --] : height[i ++];
            max = Math.max(max, (j - i + 1) * minHeight);
        }
        return max;
    }
}
