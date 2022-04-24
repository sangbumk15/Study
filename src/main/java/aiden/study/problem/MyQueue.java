package aiden.study.problem;

import java.util.Stack;

/**
 * Leetcode 232
 * Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue
 */
public class MyQueue {

    Stack<Integer> inputStack;
    Stack<Integer> outputStack;

    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void push(int x) {
        if (outputStack.isEmpty()) {
            outputStack.push(x);
        } else {
            while (!outputStack.isEmpty()) {
                inputStack.push(outputStack.pop());
            }
            outputStack.push(x);
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
    }

    public int pop() {
        return outputStack.pop();
    }

    public int peek() {
        return outputStack.peek();
    }

    public boolean empty() {
        return outputStack.isEmpty();
    }
}
