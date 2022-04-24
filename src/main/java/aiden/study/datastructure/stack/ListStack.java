package aiden.study.datastructure.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Last in first out
 */
public class ListStack<E> {

    List<E> stackArray;
    int top;

    public ListStack() {
        stackArray = new ArrayList<>();
        top = -1;
    }

    public void push(E val) {
        stackArray.add(val);
        top++;
    }

    public E pop() {
        E val = stackArray.remove(top);
        top--;
        return val;
    }

    public E peek() {
        return stackArray.get(top);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return stackArray.size();
    }
}
