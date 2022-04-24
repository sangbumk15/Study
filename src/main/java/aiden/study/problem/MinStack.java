package aiden.study.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Leetcode 155
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 */
public class MinStack {

    int MAX_SIZE = 30000;
    int[] stackArray;
    int[] minArray;
    int stackSize = -1;
    int minIndex = -1;

    public MinStack() {
        stackArray = new int[MAX_SIZE];
        minArray = new int[MAX_SIZE];
    }

    public void push(int val) {
        stackArray[++stackSize] = val;
        if (minIndex == -1 || val <= minArray[minIndex]) {
            minArray[++minIndex] = val;
        }
    }

    public void pop() {
        int top = top();
        stackSize--;
        if (top == getMin()) {
            minIndex--;
        }
    }

    public int top() {
        return stackArray[stackSize];
    }

    public int getMin() {
        return minArray[minIndex];
    }
}
