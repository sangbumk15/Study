package aiden.study.datastructure.queue;

import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;

public class ListDequeTest {

    @Test
    public void test_insertFront() {
        ListDeque<Integer> deque = new ListDeque<>();
        assertSame(null, deque.peekFront());

        deque.insertFront(1);
        deque.insertFront(2);

        assertSame(2, deque.peekFront());
        assertSame(2, deque.size());
    }

    @Test
    public void test_insertRear() {
        ListDeque<Integer> deque = new ListDeque<>();
        assertSame(null, deque.peekRear());

        deque.insertRear(1);
        deque.insertRear(2);

        assertSame(2, deque.peekRear());
        assertSame(2, deque.size());
    }

    @Test
    public void test_removeFront() {
        ListDeque<Integer> deque = new ListDeque<>();
        assertThrows(IllegalStateException.class, deque::removeFront);

        deque.insertFront(1);
        deque.insertFront(2);

        assertSame(2, deque.removeFront());
        assertSame(1, deque.size());
    }

    @Test
    public void test_removeRear() {
        ListDeque<Integer> deque = new ListDeque<>();
        assertThrows(IllegalStateException.class, deque::removeRear);

        deque.insertRear(1);
        deque.insertRear(2);

        assertSame(2, deque.removeRear());
        assertSame(1, deque.size());
    }
}
