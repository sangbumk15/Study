package aiden.study.datastructure.queue;

import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ListQueueTest {

    @Test
    public void test_enqueue() {
        ListQueue<Integer> queue = new ListQueue<>();
        queue.enqueue(1);
        assertSame(1, queue.peek());
    }

    @Test
    public void test_dequeue() {
        ListQueue<Integer> queue = new ListQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertSame(1, queue.dequeue());
        assertSame(2, queue.peek());
    }

    @Test
    public void test_isEmpty() {
        ListQueue<Integer> queue = new ListQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}
