package aiden.study.problem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LinkedListCycleTest {

    LinkedListCycle service = new LinkedListCycle();

    LinkedListCycle.ListNode head = null;

    @Test
    public void test_linked_list_cycle_no_cycle() {
        /**
         * 1 -> 2
         */
        head = new LinkedListCycle.ListNode(1);
        head.next = new LinkedListCycle.ListNode(2);

        assertFalse(service.hasCycle(head));
    }

    @Test
    public void test_linked_list_cycle_happy_case() {
        /**
         * 1 -> 2 -> 3 -> 4 -> 5 -> 2 ...
         */
        head = new LinkedListCycle.ListNode(1);
        head.next = new LinkedListCycle.ListNode(2);
        head.next.next = new LinkedListCycle.ListNode(3);
        head.next.next.next = new LinkedListCycle.ListNode(4);
        head.next.next.next.next = new LinkedListCycle.ListNode(5);
        head.next.next.next.next.next = head.next;

        assertTrue(service.hasCycle(head));
    }
}
