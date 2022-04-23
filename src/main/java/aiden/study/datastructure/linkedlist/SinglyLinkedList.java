package aiden.study.datastructure.linkedlist;

public class SinglyLinkedList<E> {

    SinglyLinkedNode<E> head = null;

    public SinglyLinkedList() {
    }

    public SinglyLinkedList(SinglyLinkedNode<E> node) {
        head = node;
    }

    public E get(int index) {
        SinglyLinkedNode<E> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node.val;
    }

    public void addAtHead(E val) {
        SinglyLinkedNode<E> node = new SinglyLinkedNode<>(val);
        node.next = head;
        head = node;
    }

    public void addAtTail(E val) {
        SinglyLinkedNode<E> node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new SinglyLinkedNode<>(val);
    }

    public void addAtIndex(int index, E val) {
        if (head == null) {
            if (index == 0) {
                head = new SinglyLinkedNode<>(val);
            }
            return;
        }

        SinglyLinkedNode<E> prev = null;
        SinglyLinkedNode<E> cur = head;
        for (int i = 0; i < index; i++) {
            if (cur == null) {
                return;
            }
            prev = cur;
            cur = cur.next;
        }

        SinglyLinkedNode<E> node = new SinglyLinkedNode<>(val);
        if (prev == null) {
            node.next = head;
            head = node;
        } else if (cur == null) {
            cur = node;
            prev.next = cur;
        } else {
            prev.next = node;
            node.next = cur;
        }
    }

    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }

        SinglyLinkedNode<E> prev = null;
        SinglyLinkedNode<E> cur = head;
        for (int i = 0; i < index; i++) {
            if (cur == null) {
                return;
            }
            prev = cur;
            cur = cur.next;
        }

        if (prev == null) {
            head = head.next;
        } else if (cur == null) {
            prev.next = null;
        } else {
            prev.next = cur.next;
        }
    }
}
