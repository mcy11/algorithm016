package pratice.week1.second;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-09 22:33
 */
public class MaxArea {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j;){
            int minHeight = height[i] > height[j] ? height[j--] : height[i++];
            max = Math.max(max, (j - i + 1) * minHeight);
        }
        return max;
    }
}
