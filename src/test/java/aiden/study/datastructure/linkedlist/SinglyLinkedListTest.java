package aiden.study.datastructure.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class SinglyLinkedListTest {

    @Test
    public void test_get() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(new SinglyLinkedNode<>(1));
        Integer val = list.get(0);
        assertSame(1, val);
    }

    @Test
    public void test_addAtHead() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(new SinglyLinkedNode<>(2));
        list.addAtHead(1);
        assertSame(1, list.get(0));
    }

    @Test
    public void test_addAtTail() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(new SinglyLinkedNode<>(1));
        list.addAtTail(2);
        assertSame(2, list.get(1));
    }

    @Test
    public void test_addAtIndex() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(new SinglyLinkedNode<>(1));
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtIndex(1, 4);
        assertSame(4, list.get(1));
        assertSame(2, list.get(2));
        assertSame(3, list.get(3));
    }

    @Test
    public void test_deleteAtIndex() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(new SinglyLinkedNode<>(1));
        list.addAtTail(2);
        list.addAtTail(3);
        list.deleteAtIndex(1);
        assertSame(1, list.get(0));
        assertSame(3, list.get(1));
    }
}
