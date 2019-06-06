package com.test.java;

import java.math.BigDecimal;
import java.util.LinkedList;

public class AddTwoNumbers {

    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     * <p>
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     * <p>
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * <p>
     * 示例：
     * <p>
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     */
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static void addTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);


        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        addTwoNumbers(l1, l2);
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList<Integer> list = new LinkedList<>();
        ListNode cur = l1;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }

        LinkedList<Integer> list2 = new LinkedList<>();
        ListNode cur2 = l2;
        while (cur2 != null) {
            list2.add(cur2.val);
            cur2 = cur2.next;
        }


        StringBuffer sbf = new StringBuffer();
        for (int i = list.size() - 1; i >= 0; i--) {
            sbf.append(list.get(i));
        }

        StringBuffer sbf2 = new StringBuffer();
        for (int i = list2.size() - 1; i >= 0; i--) {
            sbf2.append(list2.get(i));
        }


        BigDecimal b1 = new BigDecimal(sbf.toString());
        BigDecimal b2 = new BigDecimal(sbf2.toString());

        String s = (b1.add(b2)).toString();


        ListNode result = new ListNode(Integer.parseInt(String.valueOf(s.charAt(s.length() - 1))));
        ListNode temp = result;
        for (int i = s.length() - 2; i >= 0; i--) {
            temp.next = new ListNode(Integer.parseInt(String.valueOf(s.charAt(i))));
            temp = temp.next;
        }

        return result;
    }

}
