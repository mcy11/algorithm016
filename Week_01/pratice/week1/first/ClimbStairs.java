package pratice.week1.first;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-08 22:16
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int f1 = 1, f2 = 2, f3 = 3;
        for (int i = 3; i < n ; i++) {
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
        return f3;
    }
}
