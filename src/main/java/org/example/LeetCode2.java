package org.example;

public class LeetCode2 {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2, new ListNode(3, new ListNode(4)));
        ListNode l2 = new ListNode(9, new ListNode(4));

        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode current = result;

        int carryOver = 0;

        while (l1 != null || l2 != null || carryOver > 0) {
            if (l1 != null) {
                carryOver += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                carryOver += l2.val;
                l2 = l2.next;
            }

            current.next = new ListNode(carryOver % 10);
            carryOver /= 10;
            current = current.next;
        }

        return result.next;
    }


}
