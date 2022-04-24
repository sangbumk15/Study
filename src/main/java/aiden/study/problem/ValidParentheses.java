package aiden.study.problem;

import java.util.Stack;

/**
 * Leetcode 20
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (!stack.isEmpty()) {
                if (stack.peek() == '{') {
                    if (c == '}') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else if (stack.peek() == '(') {
                    if (c == ')') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else if (stack.peek() == '[') {
                    if (c == ']') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("{}()[]")); // should be true
        System.out.println(vp.isValid("{([])[]}")); // should be true
        System.out.println(vp.isValid("{]}()")); // should be false
        System.out.println(vp.isValid("{]][")); // should be false
    }
}
