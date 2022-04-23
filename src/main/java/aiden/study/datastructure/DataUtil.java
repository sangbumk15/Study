package aiden.study.datastructure;

import aiden.study.datastructure.linkedlist.SinglyLinkedList;

public class DataUtil {

    public static <E> boolean compareSinglyLinkedList(SinglyLinkedList<E> list1, SinglyLinkedList<E> list2) {
        int index = 0;
        E val1 = list1.get(index);
        E val2 = list2.get(index);
        while(val1 != null && val2 != null) {
            if (!val1.equals(val2)) {
                return false;
            }

            index++;
            val1 = list1.get(index);
            val2 = list2.get(index);

            if (val1 == null || val2 == null) {
                return false;
            }
        }

        return true;
    }
}
