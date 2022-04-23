package aiden.study.datastructure.linkedlist;

public class SinglyLinkedNode<E> {

    E val;
    SinglyLinkedNode<E> next = null;

    SinglyLinkedNode(E val) {
        this.val = val;
    }
}
