package aiden.study.datastructure.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class DoublyLinkedListTest {

    @Test
    public void test_getByIndex() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.addAtHead(1);
        assertSame(1, dll.getSize());

        dll.addAtTail(2);
        dll.addAtTail(3);
        assertSame(3, dll.getSize());
        assertSame(2, dll.getByIndex(1));
        assertSame(3, dll.getByIndex(2));
    }

    @Test
    public void test_addAtIndex() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.addAtHead(1);
        dll.addAtTail(2);
        dll.addAtTail(4);
        dll.addAtIndex(2, 3);

        assertSame(4, dll.getSize());
        assertSame(3, dll.getByIndex(2));

        dll.addAtIndex(3, 5);
        assertSame(5, dll.getByIndex(3));

        dll.addAtIndex(5, 6);
        assertSame(6, dll.getByIndex(5));
    }

    @Test
    public void test_deleteAtIndex() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.addAtHead(1);
        dll.addAtTail(2);
        dll.addAtTail(3);
        dll.addAtTail(4);
        dll.addAtTail(5);
        dll.deleteAtIndex(2);

        assertSame(4, dll.getSize());
        assertSame(4, dll.getByIndex(2));
    }
}
