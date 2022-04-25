package aiden.study.datastructure.queue;

import java.util.ArrayList;
import java.util.List;

public class ListDeque<E> {

    List<E> dequeList;

    public ListDeque() {
        dequeList = new ArrayList<>();
    }

    public void insertFront(E val) {
        dequeList.add(0, val);
    }

    public void insertRear(E val) {
        dequeList.add(val);
    }

    public E removeFront() {
        if (dequeList.isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }

        return dequeList.remove(0);
    }

    public E removeRear() {
        if (dequeList.isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }

        return dequeList.remove(dequeList.size() - 1);
    }

    public E peekFront() {
        if (dequeList.isEmpty()) {
            return null;
        }

        return dequeList.get(0);
    }

    public E peekRear() {
        if (dequeList.isEmpty()) {
            return null;
        }

        return dequeList.get(dequeList.size() - 1);
    }

    public Boolean isEmpty() {
        return dequeList.isEmpty();
    }

    public Integer size() {
        return dequeList.size();
    }
}
