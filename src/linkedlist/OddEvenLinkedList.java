package linkedlist;

import java.awt.*;

/**
 * Created by daniel on 9/29/17.
 */
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead = null;
        ListNode evenHead = null;

        ListNode oddTail = null;
        ListNode evenTail = null;

        int i = 1;
        while (head != null) {
            ListNode temp = head;
            head = head.next;

            temp.next = null;
            if (i % 2 == 0) {
                if (evenHead == null) {
                    evenTail = temp;
                    evenHead = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = temp;
                }
            } else {
                if (oddHead == null) {
                    oddTail = temp;
                    oddHead = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = temp;
                }
            }

            i += 1;
        }

        if (oddHead == null) return evenHead;
        oddTail.next = evenHead;

        return oddHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.println(new OddEvenLinkedList().oddEvenList(head));
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }


    @Override
    public String toString() {
        StringBuilder br = new StringBuilder("");
        ListNode tempHead = this;
        while (tempHead.next != null) {
            br.append(tempHead.val).append("->");
            tempHead = tempHead.next;
        }

        br.append(tempHead.val);
        return br.toString();
    }
}