package pratice.week3.first;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-27 10:43
 */
public class MyPow {

    public double myPow(double x, int n) {
        long N = n;
        return N > 0 ? quickPow(x, N) : 1.0 / quickPow(x, -N);
    }

    public double quickPow(double x, long n){
        if(n == 0){
            return 1.0;
        }

        double y = quickPow(x, n/2);

        return n % 2 == 0 ? y * y : y * y * x;

    }
}
