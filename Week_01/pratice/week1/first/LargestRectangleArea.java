package pratice.week1.first;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-13 11:00
 */
public class LargestRectangleArea {

    public int largestRectangleArea(int[] heights) {

        int left[] = new int[heights.length];
        int right[] = new int[heights.length];

        Arrays.fill(right, heights.length);

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                right[stack.peek()] = i;
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        int ans = 0;
        for (int i = 0; i < heights.length; i++){
            ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
        }
        return ans;
     }
}
