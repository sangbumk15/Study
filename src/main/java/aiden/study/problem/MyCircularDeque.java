package aiden.study.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode 641
 * Design your implementation of the circular double-ended queue (deque).
 */
public class MyCircularDeque {

    List<Integer> dequeList;
    int maxSize;

    public MyCircularDeque(int k) {
        dequeList = new ArrayList<>();
        maxSize = k;
    }

    public boolean insertFront(int value) {
        if (dequeList.size() == maxSize) {
            return false;
        }

        dequeList.add(0, value);
        return true;
    }

    public boolean insertLast(int value) {
        if (dequeList.size() == maxSize) {
            return false;
        }

        dequeList.add(value);
        return true;
    }

    public boolean deleteFront() {
        if (dequeList.size() == 0) {
            return false;
        }

        dequeList.remove(0);
        return true;
    }

    public boolean deleteLast() {
        if (dequeList.size() == 0) {
            return false;
        }

        dequeList.remove(dequeList.size() - 1);
        return true;
    }

    public int getFront() {
        if (dequeList.size() == 0) {
            return -1;
        }

        return dequeList.get(0);
    }

    public int getRear() {
        if (dequeList.size() == 0) {
            return -1;
        }

        return dequeList.get(dequeList.size() - 1);
    }

    public boolean isEmpty() {
        return dequeList.isEmpty();
    }

    public boolean isFull() {
        return dequeList.size() == maxSize;
    }
}
