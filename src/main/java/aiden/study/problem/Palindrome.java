package aiden.study.problem;

import java.util.Stack;

/**
 * Leetcode 9
 * Given an integer x, return true if x is palindrome integer.
 */
public class Palindrome {
    public boolean isPalindromeStack(int x) {
        if (x < 0) {
            return false;
        }

        String s = String.valueOf(x);
        int len = s.length();
        boolean odd = len % 2 == 1;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (i < len / 2) {
                stack.add(c);
            } else if (odd && i == len / 2) {
                continue;
            } else if (c == stack.peek()) {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }

        return true;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(121));
        System.out.println(p.isPalindrome(-121));
        System.out.println(p.isPalindrome(10));
    }
}
