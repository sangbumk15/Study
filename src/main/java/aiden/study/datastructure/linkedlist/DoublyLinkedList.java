package aiden.study.datastructure.linkedlist;

public class DoublyLinkedList<E> {

    DoublyLinkedNode<E> head = null;

    public DoublyLinkedList() {
    }

    public DoublyLinkedList(DoublyLinkedNode<E> node) {
        head = node;
    }

    public E getByIndex(int ind) {
        if (ind < 0) {
            throw new IllegalStateException("index must be greater than 0");
        }

        DoublyLinkedNode<E> temp = head;
        int tempInd = 0;

        while (temp != null) {
            if (tempInd == ind) {
                return temp.val;
            }
            tempInd++;
            temp = temp.next;
        }

        throw new IllegalStateException("index must be smaller than the size of list");
    }

    public Integer getSize() {
        DoublyLinkedNode<E> temp = head;
        int ind = 0;
        while (temp != null) {
            ind++;
            temp = temp.next;
        }

        return ind;
    }

    public void addAtHead(E val) {
        DoublyLinkedNode<E> node = new DoublyLinkedNode<>(val);
        DoublyLinkedNode<E> temp = head;
        boolean isHeadNull = head == null;
        head = node;
        head.next = temp;
        if (!isHeadNull) {
            temp.prev = head;
        }
    }

    public void addAtTail(E val) {
        DoublyLinkedNode<E> node = new DoublyLinkedNode<>(val);
        DoublyLinkedNode<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }

    public void addAtIndex(int ind, E val) {
        if (ind == 0) {
            addAtHead(val);
        }

        DoublyLinkedNode<E> node = new DoublyLinkedNode<>(val);
        int tempInd = 0;
        DoublyLinkedNode<E> temp = head;
        while (temp != null) {
            if (ind == tempInd) {
                node.prev = temp.prev.next;
                temp.prev.next = node;
                break;
            }
            temp = temp.next;
            tempInd++;
        }

        addAtTail(val);
    }

    public void deleteAtIndex(int ind) {
        if (ind == 0) {
            head = head.next;
            head.prev = null;
            return;
        }

        int tempInd = 0;
        DoublyLinkedNode<E> temp = head;
        while (temp.next.next != null) {
            if (ind == tempInd) {
                temp.next.prev = temp.prev;
                temp.prev.next = temp.next;
                return;
            }
            temp = temp.next;
            tempInd++;
        }

        temp.prev.next = null;
    }
}
