package aiden.study.problem;

/**
 * Leetcode 70
 * You are climbing a staircase. It takes n steps to reach the top.
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        int fib = 1;
        int prevFib = 1;
        for (int i = 2; i <= n; i++) {
            int temp = fib;
            fib = fib + prevFib;
            prevFib = temp;
        }

        return fib;
    }
}
