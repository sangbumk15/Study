package aiden.study.problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Leetcode 225
 * Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack
 */
public class MyStack {

    Queue<Integer> queue;
    Queue<Integer> temp;

    public MyStack() {
        queue = new LinkedList<>();
        temp = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        while (queue.size() > 1) {
            temp.add(queue.poll());
        }
        int val = queue.remove();
        while (!temp.isEmpty()) {
            queue.add(temp.poll());
        }

        return val;
    }

    public int top() {
        if (queue.size() == 1) {
            return queue.peek();
        }

        int val = 0;
        while (!queue.isEmpty()) {
            temp.add(queue.poll());
            if (queue.size() == 1) {
                val = queue.peek();
            }
        }

        while (!temp.isEmpty()) {
            queue.add(temp.poll());
        }

        return val;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
