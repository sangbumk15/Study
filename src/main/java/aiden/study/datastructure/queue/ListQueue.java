package aiden.study.datastructure.queue;

import java.util.ArrayList;
import java.util.List;

public class ListQueue<E> {

    List<E> queueList;

    public ListQueue() {
        queueList = new ArrayList<>();
    }

    public void enqueue(E val) {
        queueList.add(val);
    }

    public E dequeue() {
        return queueList.remove(0);
    }

    public E peek() {
        return queueList.get(0);
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }
}
