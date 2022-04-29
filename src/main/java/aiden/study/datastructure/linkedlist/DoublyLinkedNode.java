package aiden.study.datastructure.linkedlist;

public class DoublyLinkedNode<E> {
    E val;
    DoublyLinkedNode<E> prev = null;
    DoublyLinkedNode<E> next = null;

    public DoublyLinkedNode(E val) {
        this.val = val;
    }
}
