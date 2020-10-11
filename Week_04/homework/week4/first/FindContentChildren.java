package homework.week4.first;

import java.util.Arrays;

/**
 * @author yd
 * @version 1.0
 * @date 2020-10-10 09:39
 */
public class FindContentChildren {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int result = 0;

        for (int j = 0, i = 0; j < g.length && i < s.length; i++) {
            if(g[j] <= s[i]){
                result++;
                j++;
            }
        }

        return result;
    }
}
