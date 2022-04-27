package aiden.study.problem;

/**
 * Leetcode 509
 * Given n calculate nth Fibonacci number
 */
public class Fibonacci {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fib(10));
        System.out.println(f.fib(30));
    }
}
