package aiden.study.datastructure.stack;

import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ListStackTest {

    @Test
    public void test_push() {
        ListStack<Integer> stack = new ListStack<>();
        stack.push(1);
        assertSame(1, stack.size());
    }

    @Test
    public void test_pop() {
        ListStack<Integer> stack = new ListStack<>();
        stack.push(1);
        Integer popped = stack.pop();
        assertSame(0, stack.size());
        assertSame(1, popped);
    }

    @Test
    public void test_peek() {
        ListStack<Integer> stack = new ListStack<>();
        stack.push(1);
        stack.push(2);
        assertSame(2, stack.peek());
    }

    @Test
    public void test_is_empty() {
        ListStack<Integer> stack = new ListStack<>();
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}
