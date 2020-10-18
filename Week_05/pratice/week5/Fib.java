package pratice.week5;

/**
 * @author yd
 * @version 1.0
 * @date 2020-10-12 14:08
 */
public class Fib {

    public int fib(int N) {
        int[] nums = new int[N + 1];
        return calculate(N, nums);
    }

    public int calculate(int n, int[] nums){
        if(n <= 1){
            return n;
        }

        if(nums[n] == 0){
            nums[n] = calculate(n - 1, nums) + calculate(n - 2, nums);
        }
        return nums[n];
    }

    public int fib2(int N) {
        if(N <= 1){
            return N;
        }

        int[] nums = new int[N + 1];
        nums[1] = 1;
        for (int i = 2; i <= N; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[N];
    }
}
