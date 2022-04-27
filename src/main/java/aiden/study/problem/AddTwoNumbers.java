package aiden.study.problem;

/**
 * Leetcode 2
 * Add the two numbers and return the sum as a linked list.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode temp = res;

        int carry = 0;
        int val1 = 0, val2 = 0, sum = 0;

        while (l1 != null || l2 != null) {
            val1 = l1 != null ? l1.val : 0;
            val2 = l2 != null ? l2.val : 0;

            sum = val1 + val2 + carry;
            temp.next = new ListNode(sum % 10);
            carry = sum / 10;

            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
            temp = temp.next;
        }

        if (carry == 1) {
            temp.next = new ListNode(1);
        }

        return res.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
